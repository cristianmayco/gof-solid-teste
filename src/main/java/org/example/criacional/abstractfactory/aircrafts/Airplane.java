package org.example.criacional.abstractfactory.aircrafts;

public class Airplane implements IAircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passgeiros a bordo, autorizando decolagem");
    }

    @Override
    public void wind() {
        System.out.println("Vento a 80km/h");
    }
}
