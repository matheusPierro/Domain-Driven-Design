public class ProgramaDois {
    public static void main (String[] args){

        //Toda variavel começa com letra minuscula,
        //porem se tiver mais e uma palavra usamos o camelCase,
        //porque o java é sensitiveCase
        int idade = 18;
        double salario = 1736.78;
        //padrao americano usamos ponto(.) como casa decimal e nao virgula
        String nome = "Matheus";
        //Apenas String começa com letra maiúscula,
        //porque String é um tipo diferente, pois queremos saber as posições de cada caracter
        int idadeCachorro = 6;

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");

        int idadeLucas = 13;
        int idadeMatheus = 18;
        int soma = idadeLucas + idadeMatheus;
        System.out.println("A soma das duas idades é " + soma);
        //ou
        System.out.println("A soma das duas idades é " + (idadeLucas + idadeMatheus));



    }
}
