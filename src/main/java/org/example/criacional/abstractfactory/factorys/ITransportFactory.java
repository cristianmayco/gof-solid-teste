package org.example.criacional.abstractfactory.factorys;

import org.example.criacional.abstractfactory.aircrafts.IAircraft;
import org.example.criacional.abstractfactory.landvechicles.ILandVechicle;

public interface ITransportFactory {
    ILandVechicle createTransportVehicle();
    IAircraft createTransportAircraft();

}
