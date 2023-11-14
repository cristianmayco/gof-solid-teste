package org.example.criacional.abstractfactory.app;

import org.example.criacional.abstractfactory.aircrafts.IAircraft;
import org.example.criacional.abstractfactory.factorys.ITransportFactory;
import org.example.criacional.abstractfactory.landvechicles.ILandVechicle;

public class App {

    private ILandVechicle vechicle;
    private IAircraft aircraft;

    public App(ITransportFactory factory){
        this.vechicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vechicle.startRoute();
        aircraft.startRoute();
    }
}
