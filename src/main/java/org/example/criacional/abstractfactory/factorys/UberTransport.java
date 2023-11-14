package org.example.criacional.abstractfactory.factorys;

import org.example.criacional.abstractfactory.aircrafts.Airplane;
import org.example.criacional.abstractfactory.aircrafts.IAircraft;
import org.example.criacional.abstractfactory.landvechicles.Car;
import org.example.criacional.abstractfactory.landvechicles.ILandVechicle;

public class UberTransport implements ITransportFactory {
    @Override
    public ILandVechicle createTransportVehicle() {
       return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
