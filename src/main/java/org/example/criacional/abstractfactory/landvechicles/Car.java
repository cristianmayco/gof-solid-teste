package org.example.criacional.abstractfactory.landvechicles;

public class Car implements ILandVechicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando passageiros");
    }
}
