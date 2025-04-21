package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private int maxLoadCapacity;
    private boolean hasTrailer;

    public Truck() {
    }

    public Truck(String model, int maxLoadCapacity, boolean hasTrailer) {
        this.model = model;
        this.maxLoadCapacity = maxLoadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
