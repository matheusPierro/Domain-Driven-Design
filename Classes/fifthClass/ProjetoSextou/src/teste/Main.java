package teste;

public class Main {
    public static void main(String[] args) {

        //Abaixo a primeira pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Matheus";
        pessoa.idade = 18;

        //Abaixo a segunda pessoa
        Pessoa pessoaDois = new Pessoa();
        pessoaDois.nome = "Lucas";
        pessoaDois.idade = 13;

        System.out.println("O nome da primeira pessoa é " + pessoa.nome + " e a idade " + pessoa.idade);
        System.out.println("O nome da segunda pessoa é " + pessoaDois.nome + " e a idade " + pessoaDois.idade);

    }
}