package org.example.criacional.factorymethod;

public abstract class Transport {

   public void starTransport(){
       IVehicle vehicle = createTransport();
       vehicle.startRoute();

    }

    protected abstract IVehicle createTransport();
}
