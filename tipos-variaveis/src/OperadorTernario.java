public class OperadorTernario {

    public static void main(String[] args) {
        
        int a, b;

        a = 6;
        b = 6;

        String resultado = "";

        if (a==b) {

            resultado = "verdadeiro";

        }else{

            resultado = "falso";
            
        }

        System.out.println(resultado);

        //Usando o exemplo acima com operador ternário

        String resultadoTernario = a==b ? "verdadeiro" : "falso";

        System.out.println("Resultado com operador ternário: " + resultadoTernario);

        int resultadoTernarioInt =  a==b ? 1 : 0;

        System.out.println(resultadoTernarioInt);
    }
    
}
