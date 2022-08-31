package org.example;

public class Main{
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Matheus";
        pessoa.idade = 18;

        System.out.println("O nome é " + pessoa.nome + "\nA idade é " + pessoa.idade);

        Pessoa pessoaDois = new Pessoa();
        pessoaDois.nome = "Gabriel";
        pessoaDois.idade = 19;

        System.out.println("O nome é " + pessoaDois.nome + "\nA idade é " + pessoaDois.idade);

    }
}