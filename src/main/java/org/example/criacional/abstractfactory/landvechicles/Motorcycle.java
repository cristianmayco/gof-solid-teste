package org.example.criacional.abstractfactory.landvechicles;

public class Motorcycle implements ILandVechicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("pegando encomendas");
    }
}
