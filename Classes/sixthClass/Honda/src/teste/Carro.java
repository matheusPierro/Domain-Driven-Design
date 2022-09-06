package teste;

public class Carro {
    private String nome;
    private double capacidadeCombustivel;
    private int qtdJanela;

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdJanela() {
        return qtdJanela;
    }

    public void setQtdJanela(int qtdJanela) {
        this.qtdJanela = qtdJanela;
    }

    //Métodos são ações que vamos aprofundar futuramente.
    public String mostrarAtributos(){
        return "O nome do carro é " + getNome() +
                "\ncom capacidade de combustível de " + getCapacidadeCombustivel() +
                "\ne o carro possui " + getQtdJanela() + " janelas";
    }
}