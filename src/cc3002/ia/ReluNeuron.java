package cc3002.ia;

/*
    This is a Relu Neural Network representation
 */

public class ReluNeuron extends Neuron {

    public ReluNeuron(double w1, double w2, double b) {
        super(w1, w2, b);
    }

    public double feed(double input1, double input2) {
        double z = this.computeZ(input1, input2);
        // this is just an if else statement
        return (z > 0) ? z : 0;
    }

}
