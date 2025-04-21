package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("d2", 2, 1));
        excavators.add(new Excavator("d5", 4, 4));
        excavators.add(new Excavator("d8", 5, 1));
        return excavators;
    }
}
