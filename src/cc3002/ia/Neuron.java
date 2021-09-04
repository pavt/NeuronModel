package cc3002.ia;

/*
This is a simple Neural Network Class representation
 */

public class Neuron {
    private double weight1, weight2;
    private double bias;

    public Neuron(double w1, double w2, double b) {
        weight1 = w1;
        weight2 = w2;
        bias = b;
    }

    public double computeZ(double input1, double input2) {
        return input1 * weight1 + input2 * weight2 + bias;
    }

    public double feed(double input1, double input2) {
        double z = this.computeZ(input1, input2);
        if (z <= 0)
            return 0;
        else
            return 1;
    }
}
