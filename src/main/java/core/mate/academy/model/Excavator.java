package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private double armLength;
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(String model, double armLength, int bucketCapacity) {
        this.model = model;
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
