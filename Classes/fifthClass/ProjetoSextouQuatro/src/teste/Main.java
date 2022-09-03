package teste;

public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular();
        //celular.nome = "Iphone Matheus"

        //Colocar um valor no atributo nome estando privado
        celular.setNome("Iphone Matheus");

        System.out.println("O nome do celular é " + celular.getNome());

    }
}