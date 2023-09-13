// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;

       if(valorSolicitado < saldo){

        saldo = saldo - valorSolicitado;
         System.out.println("Saqui efetuado com sucesso! \n Seu saldo atual é: R$" + saldo);
    }else{
        System.out.println("Saque não permitido. Seu saldo é insuficiente!");
    }
       

    }
}