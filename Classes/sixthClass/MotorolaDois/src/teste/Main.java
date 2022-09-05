package teste;

public class Main {
    public static void main(String[] args) {

        /*\t da um tab para nós no texto*/



        Celular celular = new Celular();

        /*
        celular.nome = "Motorola 23 Play";
        celular.peso = 222.5;
        celular.quantFoneOuvido = 1;

        System.out.println("O nome do celular é " + celular.nome +
                        "\nO peso do celular é " + celular.peso +
                        "\n\tA quantidade de fones de ouvido do celular é " + celular.quantFoneOuvido);
        */

        celular.setNome("Motorola Z3 Play");
        celular.setPeso(222.5);
        celular.setQuantFoneOuvido(1);

        System.out.println(
                "O nome do celular é " + celular.getNome() +
                "\nO peso do celular é " + celular.getPeso()+
                "\n\tA quantidade de fones de ouvido do celular é " + celular.getQuantFoneOuvido()
        );

    }
}