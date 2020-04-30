package neural_network_design;

import java.util.ArrayList;

public class TrainedValues {

    private ArrayList<Integer> inputs;
    private ArrayList<Double> expectedValues;
    public TrainedValues(ArrayList<Integer> input, ArrayList<Double> output) {
        inputs = input;
        expectedValues = output;
    }

    public ArrayList<Integer> getInputs() {
        return inputs;
    }

    public ArrayList<Double> getRealOutput() {
        return expectedValues;
    }
}

