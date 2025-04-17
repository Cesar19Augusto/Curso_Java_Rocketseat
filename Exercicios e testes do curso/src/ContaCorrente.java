public class ContaCorrente {
    static String nomeDoCliente = "José";
    static String dataDeNacimento = "19/04/2002";
    static int numeroDaConta = 555010;
    static int numeroDaAgencia = 0001;
    static double saldoDaConta = 123.99;

    public static void sacandoValor (int valorSolicitado){
        if (saldoDaConta >= valorSolicitado){
            saldoDaConta -= valorSolicitado;
            System.out.println ("Seu Saque no valor de " + saldoDaConta + " foi realizado com sucesso!");
        }
        else {
            System.out.println("O valor não é suficiente!");
        }

    }
    public static void transferindo (int valorSolicitado){
        if(valorSolicitado <= saldoDaConta){
            saldoDaConta -= valorSolicitado;
            System.out.println("Sua Transferencia no valor de " + valorSolicitado + " foi realizada com sucesso!");
        }
        else {
            System.out.println("O valor não é suficiente!");
        }
    }
    //}
    //public static void cancelamento (){

    //}
    //public static void consulta (){

    //}
    public static void mostrarSaldo (){
        System.out.println("Seu saldo é de: " + saldoDaConta + "!");
    }

    public static void main(String[] args){
        mostrarSaldo();
        sacandoValor(10);
        transferindo(10);
        mostrarSaldo();
    }
}