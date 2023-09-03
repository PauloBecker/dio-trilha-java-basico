public class Operadores {

    public static void main(String[] args) {
        
        // String nomeCompleto = "LINGUAGEM " + "JAVA";

        // System.out.println(nomeCompleto);
        
        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // ###### Operadores Unários #######

        int numero = 5;

        numero = -5;//número passa a ser negativo

        System.out.println(numero);

        numero = numero * -1; //Convertendo nuúmero para positivo

        System.out.println(numero);

        //Repetição

        numero = 5;

        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        numero = 0;

        while (numero < 10) {

            numero++;

            System.out.println(numero);
    
        }

        System.out.println(numero);



    }
    
}
