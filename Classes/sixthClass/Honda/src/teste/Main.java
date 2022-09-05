package teste;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("HRV");
        carro.setCapacidadeCombustivel(50.3);
        carro.setQtdJanela(6);


        System.out.println(
                "O nome do carro é " + carro.getNome() +
                "\ncom capacidade de combustível de " + carro.getCapacidadeCombustivel() +
                "\ne o carro possui " + carro.getQtdJanela() + " janelas"
        );

        Carro carroDois = new Carro();
        carroDois.setNome("Civic");
        carroDois.setCapacidadeCombustivel(42.6);
        carroDois.setQtdJanela(8);

        System.out.println("------------------------------------------------");

        System.out.println(
                "O nome do carro é " + carroDois.getNome() +
                        "\ncom capacidade de combustível de " + carroDois.getCapacidadeCombustivel() +
                        "\ne o carro possui " + carroDois.getQtdJanela() + " janelas"
        );
    }
}