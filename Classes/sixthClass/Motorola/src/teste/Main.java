package teste;

public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular();

        celular.nome = "Motorola 23 Play";
        celular.peso = 222.5;
        celular.quantFoneOuvido = 1;

        System.out.println("O nome do celular é " + celular.nome +
                        "\nO peso do celular é " + celular.peso +
                        "\n\tA quantidade de fones de ouvido do celular é " + celular.quantFoneOuvido);

    }
}