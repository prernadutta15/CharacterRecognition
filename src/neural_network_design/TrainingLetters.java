package neural_network_design;

import java.util.ArrayList;

public class TrainingLetters {

    private static final int NEURON_COUNT = 26;

    private Neuron neuron;
    private ArrayList<TrainedValues> trainedValues;

    public TrainingLetters() {
        neuron = new Neuron();
        neuron.appendNeurons(NEURON_COUNT);
        trainedValues = FileHandling.readTrainedValues();
    }

    public void train(long count) {
       // System.out.print("trained="+trainedValues.size());
        for (long i = 0; i < count; i++) {
            int index = ((int) (Math.random() * trainedValues.size()));
            TrainedValues set = trainedValues.get(index);
            neuron.setAllInputs(set.getInputs());
            neuron.adjustWeights(set.getRealOutput());
        }
    }

    public void setInputs(ArrayList<Integer> inputs) {
        neuron.setAllInputs(inputs);
    }

    public void addTrainingLetters(TrainedValues newSet) {
        trainedValues.add(newSet);
    }

    public ArrayList<Double> getOutputs() {
        return neuron.getAllOutputs();
    }

}
