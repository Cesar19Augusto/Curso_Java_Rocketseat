import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ContaCorrente {
    static String nomeDoCliente = "José";
    LocalDate dataNacimento = LocalDate.of(2002,04,19);
    static int numeroDaConta = 555010;
    static int numeroDaAgencia = 0001;
    static double saldoDaConta = 123.99;
    static boolean ativo = true;

    public static void sacandoValor (int valorSolicitado){
        if (saldoDaConta >= valorSolicitado){
            saldoDaConta -= valorSolicitado;
            registrarMovimentacao("Saque", valorSolicitado);
            System.out.println ("Seu Saque no valor de " + saldoDaConta + " foi realizado com sucesso!");
        }
        else {
            System.out.println("O valor não é suficiente!");
        }

    }
    public static void transferindo (int valorSolicitado){
        if(valorSolicitado <= saldoDaConta){
            saldoDaConta -= valorSolicitado;
            registrarMovimentacao("Transferencia", valorSolicitado);
            System.out.println("Sua Transferencia no valor de " + valorSolicitado + " foi realizada com sucesso!");
        }
        else {
            System.out.println("O valor não é suficiente!");
        }
    }
    public static void cancelamento (){
        ativo = !ativo;
        System.out.println("A situação da conta é: " + ativo);
    }


    static List<movimentacao> historico = new ArrayList<>();
    public static class movimentacao {
        double valor;
        String tipo;
        LocalDateTime dataHora;

        public movimentacao (double valor, String tipo){
            this.valor= valor;
            this.tipo= tipo;
            this.dataHora= LocalDateTime.now();
        }
    }
    public static void registrarMovimentacao(String tipo, double valor){
        movimentacao nova = new movimentacao(valor, tipo);
        historico.add(nova);
    }

    public static void filtroMovimentacao (){
        LocalDateTime agora =  LocalDateTime.now();
        System.out.println("Movimentações nos últimos 60 minutos:");

        for (movimentacao m : historico){
            long diferencaMinutos = Duration.between(m.dataHora, agora).toMinutes();
            if (diferencaMinutos <= 60){
                System.out.println(m.tipo + " de " + m.valor + " às " + m.dataHora);
            }
        }
    }

    public static void mostrarSaldo (){
        System.out.println("Seu saldo é de: " + saldoDaConta + "!");
    }

    public static void main(String[] args){
        mostrarSaldo();
        sacandoValor(10);
        transferindo(10);
        filtroMovimentacao();
        mostrarSaldo();
        cancelamento();
    }
}