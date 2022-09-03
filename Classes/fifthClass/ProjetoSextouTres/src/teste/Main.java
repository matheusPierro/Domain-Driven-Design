package teste;

public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular();
        celular.nome = "Iphone Matheus";
        celular.peso = 0.5;
        celular.altura = 0.15;
        celular.largura = 0.1;

        System.out.println("O nome do celular é " + celular.nome +
                "\no peso é " + celular.peso +
                "\na altura é " + celular.altura +
                "\no largura é " + celular.largura);

    }
}