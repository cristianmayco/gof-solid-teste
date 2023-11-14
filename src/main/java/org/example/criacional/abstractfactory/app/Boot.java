package org.example.criacional.abstractfactory.app;

import org.example.criacional.abstractfactory.aircrafts.IAircraft;
import org.example.criacional.abstractfactory.factorys.ITransportFactory;
import org.example.criacional.abstractfactory.factorys.NineNineTransport;
import org.example.criacional.abstractfactory.factorys.UberTransport;
import org.example.criacional.abstractfactory.landvechicles.ILandVechicle;

public class Boot {

    public static App configureApplication() {
            App app;
            ITransportFactory transportFactory;

            String company = "Uber2";

            if (company.equals("Uber")) {
                transportFactory = new UberTransport();
            }else{
                transportFactory = new NineNineTransport();
            }

            app = new App(transportFactory);

            return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.startRoute();

    }



}
