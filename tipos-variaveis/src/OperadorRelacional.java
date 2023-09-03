
public class OperadorRelacional {

    public static void main(String[] args) {
        
        int numero1 = 1;

        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Número um é igual a número dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número um é igual a número dois? " + simNao);
    
        simNao = numero1 > numero2;

        System.out.println("Número um é igual a número dois? " + simNao);
    

        if (numero1 > numero2) {

            System.out.println("A nossa condição é verdadeira!");
            
        }else{

            System.out.println("A nossa condição é falsa!");

        }

        String nomeUm = "Paulo Becker";
        String nomeDois = new String("Paulo Becker");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));//método equal para objetos é o mais recomendado

    }

}

