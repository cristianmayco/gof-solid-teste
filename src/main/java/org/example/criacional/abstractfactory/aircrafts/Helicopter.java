package org.example.criacional.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem com helicóptero");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros acomordados, iniciando a decolagem");
    }

    @Override
    public void wind() {
        System.out.printf("Vento a 10km/h");
    }
}
