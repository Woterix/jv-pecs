package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("c12", 2, true));
        trucks.add(new Truck("ca8", 4, true));
        trucks.add(new Truck("545f4s2", 5,true));
        return trucks;
    }
}
