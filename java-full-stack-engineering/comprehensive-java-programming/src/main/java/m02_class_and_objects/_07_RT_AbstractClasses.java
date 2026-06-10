package m02_class_and_objects;

abstract class Bike {
    private int distanceTravelled;

    public Bike(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public abstract int mileage();

    public int fuelNeeded() {
        return this.distanceTravelled / mileage();
    }
}

class Duke extends Bike {

    public Duke(int distanceTravelled) {
        super(distanceTravelled);
    }

    @Override
    public int mileage() {
        return 10;
    }

}

class Pulsar extends Bike {

    public Pulsar(int distanceTravelled) {
        super(distanceTravelled);
    }

    @Override
    public int mileage() {
        return 100;
    }

}

public class _07_RT_AbstractClasses {
    public static void main(String[] args) {
        Bike duke = new Duke(100);
        System.out.println(duke.fuelNeeded());
    }

}
