package org.example.criacional.factorymethod;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        System.out.printf("Iniciando a rota com o carro");
    }

    @Override
    public void getCargo() {
        System.out.println("Carro está indo pegar os passageiros");
    }
}
