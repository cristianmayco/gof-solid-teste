package org.example.criacional.abstractfactory.factorys;

import org.example.criacional.abstractfactory.aircrafts.Helicopter;
import org.example.criacional.abstractfactory.aircrafts.IAircraft;
import org.example.criacional.abstractfactory.landvechicles.ILandVechicle;
import org.example.criacional.abstractfactory.landvechicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVechicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
       return new Helicopter();
    }
}
