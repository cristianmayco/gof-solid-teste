package org.example.criacional.factorymethod;

public class MotocycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motocycle();
    }
}
