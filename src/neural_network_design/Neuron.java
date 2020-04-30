package neural_network_design;
import java.util.ArrayList;

public class Neuron {
    /**
     * A neural network in its minimality tries to mimic the actions of the human brain. The smallest unit of this network is
     * hence named after the brain cell 'neuron'.
     * By the concept of a neural network,u(k)=sum[w(j,k)*x(j)]+bias. This u(k) is now passed through an activation function(which is
     * the sigmoidal function in this case.What we finally get is the output y(k).
     * Notations:
     * u(k)=stores the temporary output
     * w(j,k)=weights of each neuron randomly chosen
     * x(j)=input neuron
     * bias=a constant value added to the output before passing through the activation function.
     * y(k)=holds the final output
     */
    //initial constants
    private static final int BIAS_WEIGHT = 1;
    private static final double LEARNING_RATIO = 0.1;
    //as per the concept,we need an input array,a weight array.
    //Since the size is unspecified,we use ArrayLists
    private ArrayList<Integer> realinputs;//inputs are either 0 or 1 hence integers
    private ArrayList<Double> weights;//weights are randomly generated and hence is declared double
    private double biasWeight;//A random number
    private double output;
    private ArrayList<Neuron> neurons;

    public Neuron() {
        //non-parameterised constructor
        realinputs = new ArrayList<>();
        weights = new ArrayList<>();
        biasWeight = Math.random();
        neurons=new ArrayList<>();
        //setRealInputs(realinputs);
    }
    /*
    *
    */
    public void setRealInputs(ArrayList<Integer> r_inputs) {

        if (realinputs.size() == 0) {
            realinputs = new ArrayList<>(r_inputs);
            //System.out.println("real_input= "+realinputs.size());
            //when inputs is just created,weights is also filled randomly for each corresponding input
            for (int i = 0; i < realinputs.size(); i++) {
                weights.add(Math.random());
            }
        }

        realinputs = new ArrayList<>(r_inputs);
    }


    public double getOutput() {
        double sum = 0;
        //calculates the final output based on the formula mentioned above and returns it
        for (int i = 0; i < realinputs.size(); i++) {
            sum += realinputs.get(i) * weights.get(i);
        }
        sum += BIAS_WEIGHT * biasWeight;
        //here,sum is the temporary output before being passed to the activation function
        output = sigmoidValue(sum);
        return output;
    }

    public void setAllInputs(ArrayList<Integer> inputs) {
        for (Neuron n : neurons)
            n.setRealInputs(inputs);
    }

    public ArrayList<Double> getAllOutputs() {
        ArrayList<Double> outputs = new ArrayList<>();
        for (Neuron n : neurons)
            outputs.add(n.getOutput());

        return outputs;
    }


    public static double sigmoidValue(double arg) {
        //the activation function
        return (1 / (1 + Math.exp(-arg)));

    }
    public void reorderWeights(double delta) {
        //based on the mathematical formula
       // System.out.println("REALINPUT= "+realinputs.size());
        for (int i = 0; i < realinputs.size(); i++) {
            double d = weights.get(i);

            d += LEARNING_RATIO * delta * realinputs.get(i);
            weights.set(i, d);
            //System.out.println("weight(d)= "+d);
        }

        biasWeight += LEARNING_RATIO * delta * BIAS_WEIGHT;
    }
    public void appendNeurons(int count)
    {
        for(int i=0;i<count;i++)
        {
            neurons.add(new Neuron());
        }
    }
    public void adjustWeights(ArrayList<Double> goodOutput) {
        //System.out.println("adjust= "+realinputs.size());
        for (int i = 0; i < neurons.size(); i++) {
            double delta = goodOutput.get(i) - neurons.get(i).getOutput();
            neurons.get(i).reorderWeights(delta);
            //System.out.print("Weights(delta)= "+delta);
        }
    }


}
