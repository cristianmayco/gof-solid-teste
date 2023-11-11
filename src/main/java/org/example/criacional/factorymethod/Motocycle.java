package org.example.criacional.factorymethod;

public class Motocycle implements IVehicle {
    @Override
    public void startRoute() {
        System.out.println("Iniciando a rota de moto");
    }

    @Override
    public void getCargo() {
        System.out.println("pegando a encomenda de moto");
    }
}
