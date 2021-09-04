package cc3002.ia;

public class NeuronExample {

    public static void main(String[] args) {
        System.out.println("NEURON - OR");

        Neuron or = new Neuron(1.0, 1.0, -0.5);
        System.out.println("0 OR 0 = " + or.feed(0, 0));
        System.out.println("1 OR 0 = " + or.feed(1, 0));

        System.out.println("NEURON - AND");

        Neuron and = new Neuron(1.0, 2.0, -1.5);
        System.out.println("1 AND 0 = " + and.feed(1, 0));
        System.out.println("1 AND 1 = " + and.feed(1, 1));

        System.out.println("RELU AND");

        Neuron and2 = new ReluNeuron(1.0, 2.0, -1.5);
        System.out.println("1 RAND 0 = " + and2.feed(1, 0));
        System.out.println("1 RAND 1 = " + and2.feed(1, 1));
    }
}
