package teste;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Civic";
        carro.peso = 950;
        carro.qtdDeJanela = 6;

        System.out.println("O nome do carro é " + carro.nome + ", peso é " + carro.peso + " e a quantidade de janelas é " + carro.qtdDeJanela);
    }
}