package gui_design;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RightTable extends JPanel{
    /*This portion creates the right panel used to display the output after recognising
    This produces a table using each cell and sets a color to the corresponding cell if the pixel is marked.
     */
    protected ArrayList<Cell> cell;
    private int width,height,count;

    public RightTable(int w,int h,int c)
    {
        super();
        //sets the parameters
        width=w;
        height=h;
        count=c;
        setPreferredSize(new Dimension(w,h));
        setBackground(Color.orange);
        makeTable();
    }
    void makeTable()
    {
        //creates the table using every cell
        cell=new ArrayList<>();
        int i,j;
        int cw,ch;//cell width and cell height
        cw=width/count;//stores the width of each cell
        ch=height/count;
        for(i=1;i<=count;i++)
        {
            for(j=1;j<=count;j++) {
                cell.add(new Cell(cw*i,ch*j, cw, ch));//adds the cell dimension to the arraylist
            }
        }
        /*for (i = 0; i < count; i++) {
            for (j = 0; j < count; j++) {
                cell.add(new Cell(i * (width / count), j * (height / count), width / count, height / count));
            }
        }*/
        repaint();
    }
    public ArrayList<Integer> getPixels() {
        ArrayList<Integer> pixels = new ArrayList<>();
        for (Cell s : cell) {
            if (s.getFlag())
                pixels.add(1);
            else
                pixels.add(0);
        }

        return pixels;
    }
    private void makeTable(Graphics g) throws InterruptedException{
        g.setColor(Color.red);
        g.drawLine(0,0,width+1,0);
        g.drawLine(0,0,0,height+1);
        for (Cell c : cell) {
            // Thread.sleep(100);
            g.drawLine(0, c.getY()-1, width+1, c.getY()-1);
            g.drawLine(c.getX()-1, 0, c.getX()-1, height+1);
           /* g.drawLine(0, 20, 400, 20);
            //Thread.sleep(100);
            g.drawLine(400, 20, 400, 20);*/
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            makeTable(g);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        markCell(g);
       // repaint();
    }



    private void markCell(Graphics g) {
        g.setColor(Color.red);
        for (Cell c : cell) {
            if (c.getFlag()==true)//if c is set(marked),it is filled with blue
            {
                g.fillRect(c.getX(), c.getY(), c.getWidth(), c.getHeight());
            }
        }
    }

    public ArrayList<Integer> getMarkedCells() {
        //we store the marked cells and return it
        ArrayList<Integer> mark = new ArrayList<>();//stores the cells that are marked
        for (Cell c:cell) {
            //1 for marked,0 for unmarked
            if (c.getFlag())
                mark.add(1);
            else
                mark.add(0);
        }

        return mark;
    }

    public void clear() {
        for (Cell c:cell) {
            c.setFlag(false);
        }

        repaint();
    }

    public void drawLetter(ArrayList<Integer> pixels) {
        for (int i = 0; i < pixels.size(); i++) {
            if (pixels.get(i) == 1)
                cell.get(i).setFlag(true);
            else
                cell.get(i).setFlag(false);
        }

        repaint();
    }
    public ArrayList<Cell> getCell() {
        return cell;
    }
}
