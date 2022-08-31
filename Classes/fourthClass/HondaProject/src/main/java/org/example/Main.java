package org.example;

public class Main {
    public static void main(String[] args) {

    Carro carro = new Carro();
    carro.nome = "Civic";
    carro.capacidadeTanque = 40.300;

    System.out.println("O nome do carro é " + carro.nome + "\nSua capacidade é " + carro.capacidadeTanque);


    Carro carroDois = new Carro();
    carroDois.nome = "HRV";
    carroDois.capacidadeTanque = 47.855;

    System.out.println("O nome do carro é " + carroDois.nome + "\nSua capacidade é " + carroDois.capacidadeTanque);

    Carro carroTres = new Carro();
    carroTres.nome = "CIT";

    System.out.println("O nome do carro é " + carroTres.nome + "\nSua capacidade é " + carroTres.capacidadeTanque);

    }
}