package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private double bladeWidth;
    private boolean isTracked;

    public Bulldozer() {

    }

    public Bulldozer(String model, double bladeWidth, boolean isTracked) {
        this.model = model;
        this.bladeWidth = bladeWidth;
        this.isTracked = isTracked;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
