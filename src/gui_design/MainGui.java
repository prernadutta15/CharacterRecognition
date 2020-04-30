package gui_design;
import neural_network_design.*;
import neural_network_design.ExpectedPixels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;


public class MainGui extends JFrame {

    private final int RESOLUTION = 20;
    private JPanel mainPanel;
    private LeftTable leftTable;
    private RightTable rightTable;
    private JButton clearButton;
    private JButton trainButton;
    private JButton transformButton;
    private JButton helpButton;
    private JButton trainNetworkButton;
    private JButton drawLetterButton;
    private JComboBox<String> drawLetterCombo;
    private JComboBox<String> trainAsCombo;
    private JTextArea outputTextArea;
    private TrainingLetters trainingLetters;
    public static void main(String[] args) {
        new MainGui();

    }

    public MainGui() {
        super("IDENTIFYING LETTERS");
       trainingLetters = new TrainingLetters();
        //displays the panels
        setMainPanel();
        setLeftSide();
        setCenterArea();
        setRightSide();
        setOutputPanel();
        setOnClicks();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //The panels are made visible
        setVisible(true);
        setSize(new Dimension(1260, 500));
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.orange);
        setContentPane(mainPanel);
    }

    private void setLeftSide() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        panel.setPreferredSize(new Dimension(410, 440));

        drawLetterButton = new JButton("Draw letter:");
        drawLetterCombo = new JComboBox<>(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"});

        leftTable = new LeftTable(400, 400, RESOLUTION);
        panel.add(drawLetterButton);
        panel.add(drawLetterCombo);
        panel.add(leftTable);

        mainPanel.add(panel);
    }

    private void setCenterArea() {
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.orange);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;


        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setPreferredSize(new Dimension(200, 400));
        centerPanel.setBorder(BorderFactory.createDashedBorder(Color.red));
        Border border = BorderFactory.createDashedBorder(Color.red);
        centerPanel.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(30, 30, 30, 30)));
        Border border2 = BorderFactory.createDashedBorder(Color.red);
        centerPanel.setBorder(BorderFactory.createCompoundBorder(border2,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        trainNetworkButton = new JButton("Click to train");
        centerPanel.add(Box.createVerticalStrut(70));
        centerPanel.add(new JLabel("Options:", SwingConstants.CENTER), gbc);
        centerPanel.add(Box.createVerticalStrut(50));

        helpButton = new JButton("HELP");
        centerPanel.add(trainNetworkButton, gbc);
        centerPanel.add(helpButton, gbc);

        centerPanel.add(Box.createVerticalStrut(50));

        transformButton = new JButton(">>");
        centerPanel.add(transformButton, gbc);

        centerPanel.add(Box.createVerticalStrut(50));

        clearButton = new JButton("Clear");
        clearButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(clearButton, gbc);

        centerPanel.add(Box.createVerticalStrut(50));

        centerPanel.add(new JLabel("Train as:", SwingConstants.CENTER), gbc);

        trainAsCombo = new JComboBox<>(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Z", "Y"});
        trainAsCombo.setAlignmentX(Component.CENTER_ALIGNMENT);
        trainAsCombo.setMaximumSize(new Dimension((int) trainAsCombo.getPreferredSize().getWidth(), 30));
        centerPanel.add(trainAsCombo, gbc);

        trainButton = new JButton("Train");
        centerPanel.add(trainButton, gbc);

        mainPanel.add(centerPanel);
    }

    private void setRightSide() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);
        panel.setPreferredSize(new Dimension(410, 440));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        rightTable = new RightTable(400, 400, RESOLUTION);
        panel.add(rightTable);
        mainPanel.add(panel);

    }

    private void setOutputPanel() {
        JPanel outputPanel = new JPanel();
        outputPanel.setPreferredSize(new Dimension(200, 430));

        outputTextArea = new JTextArea();
        outputTextArea.setPreferredSize(new Dimension(200, 430));
        outputPanel.add(outputTextArea);

        mainPanel.add(outputPanel);
    }


    private void setOnClicks() {
        clearButton.addActionListener(e -> leftTable.clear());

        trainButton.addActionListener(e -> {
            String letter = (String) trainAsCombo.getSelectedItem();
            trainingLetters.addTrainingLetters(new TrainedValues(leftTable.getPixels(), ExpectedOutputs.getInstance().getExpectedOutput(letter.charAt((0)))));
            FileHandling.saveToFile(leftTable.getPixels(), letter);
        });
           /* trainNetworkButton.addActionListener(e -> {
        int number = 0;
        try {
            number = 5000;
        } catch (Exception x) {
            JOptionPane.showMessageDialog(this, "Wrong input", "ERROR", JOptionPane.PLAIN_MESSAGE);
        }

        trainingLetters.train(number);
    });*/
        transformButton.addActionListener(e -> {
          trainingLetters.setInputs(leftTable.getPixels());

            ArrayList<Double> outputs = trainingLetters.getOutputs();
            int index = 0;
            for (int i = 0; i < outputs.size(); i++) {
                if (outputs.get(i) > outputs.get(index)) {
                    System.out.print(" "+outputs.get(index));
                    index = i;
                }

            }
            System.out.println(index);

            updateTextArea();

           trainAsCombo.setSelectedIndex(index);
           rightTable.drawLetter(ExpectedPixels.getExpectedPixels().getPixelValues(index));
        });


        helpButton.addActionListener(e -> {
            StringBuilder sb = new StringBuilder();
            sb.append("Train network X times after you start the program. Recommended 5000 times\n");
            sb.append("\n");
            sb.append("Use left/right mouse button to draw/erase\n");
            sb.append("\n");
            sb.append("Click \">>\" to see result\n");
            sb.append("\n");
            sb.append("Click \"Train\" to train specific letter\n");
            JOptionPane.showMessageDialog(this, sb.toString(), "Help", JOptionPane.PLAIN_MESSAGE);
        });

        trainNetworkButton.addActionListener(e -> {
            int number = 0;
            try {
                number = 5000;
            } catch (Exception x) {
                JOptionPane.showMessageDialog(this, "Wrong input", "ERROR", JOptionPane.PLAIN_MESSAGE);
            }

           trainingLetters.train(number);
        });

        drawLetterButton.addActionListener(e -> {
            String letter = (String) drawLetterCombo.getSelectedItem();
            ArrayList<Integer> goodPixels = ExpectedPixels.getExpectedPixels().getPixelValues(letter.charAt(0));
            leftTable.drawLetter(goodPixels);
        });

       /* drawLetterCombo.addActionListener(e -> {
            String letter = (String) drawLetterCombo.getSelectedItem();
            ArrayList<Integer> goodPixels = ExpectedPixels.getExpectedPixels().getPixelValues(letter.charAt(0));
            leftTable.drawLetter(goodPixels);
        });*/
        drawLetterButton.addActionListener(e -> {
            String letter = (String) drawLetterCombo.getSelectedItem();
            ArrayList<Integer> goodPixels = ExpectedPixels.getExpectedPixels().getPixelValues(letter.charAt(0));
            leftTable.drawLetter(goodPixels);
        });

        drawLetterCombo.addActionListener(e -> {
            String letter = (String) drawLetterCombo.getSelectedItem();
            ArrayList<Integer> goodPixels = ExpectedPixels.getExpectedPixels().getPixelValues(letter.charAt(0));
            leftTable.drawLetter(goodPixels);
        });


    }

    private void updateTextArea() {
       StringBuilder sb = new StringBuilder();
        ArrayList<Double> outputs = trainingLetters.getOutputs();
        for (int i = 0; i < outputs.size(); i++) {
            int letterValue = i + 65;
            sb.append((char) letterValue);
            double value = outputs.get(i);
            if (value < 0.01)
                value = 0;
            if (value > 0.99)
                value = 1;

            value *= 1000;
            int x = (int) (value);
            value = x / 1000.0;

            sb.append("\t " + value);
            sb.append("\n");
        }
        outputTextArea.setText(sb.toString());
    }

}
