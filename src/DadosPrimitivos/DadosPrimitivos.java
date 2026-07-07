package DadosPrimitivos;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        O objetivo dessa aula é aprender os tipos (os principais) de dados que uma variável deve receber

         */
        int idade = 16;  // valor máximo: 2.147.483.647
        Long saldoBancario = 99999L; // Valor máximo: 9.223.372.036.854.775.807
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;

        System.out.println(idade); // Comando para "imprimir" para o usuário a variável
        System.out.println(altura);
        System.out.println("Minha idade é = " + idade);
        System.out.println("vivoOuMorto = " + vivoOuMorto);


    }
}
