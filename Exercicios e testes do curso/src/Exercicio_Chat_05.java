/* Seção 5 – Operadores
Exercício:
-Peça dois números inteiros ao usuário e:
-Mostre a soma, subtração, multiplicação, divisão e o resto da divisão.
-Use um operador ternário para dizer qual número é maior.
-Objetivo: Trabalhar operadores aritméticos, lógicos e ternário.
*/

import java.util.Scanner;

public class Exercicio_Chat_05 {
    public static int somando;
    public static int subtraindo;
    public static int dividindo;
    public static int multiplicando;
    public static void main(String[] args){
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        Scanner divisor = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um valor inteiro");
        int valor1 = numero1.nextInt();
        System.out.println("Insira o segundo valor inteiro");
        int valor2 = numero2.nextInt();
        boolean operacaoValida = false;
        System.out.println(valor1 > valor2 ? "O primeiro valor é maior que o segundo valor." : "O segundo valor é maior que o primeiro valor.");

    while (!operacaoValida){
        System.out.println("Qual é a conta que deseja realizar? (soma, subtração, multiplicação, divisão ou +, -, *, /)");
        String operacao = entrada.nextLine();

            if (operacao.equals("soma") || operacao.equals("+")) {
                somando = valor1 + valor2;
                System.out.println("O resultado é " + somando);
                operacaoValida = true;
                return;
            } else if (operacao.equals("subitração") || operacao.equals("-")) {
                subtraindo = valor1 - valor2;
                System.out.println("O resultado é " + subtraindo);
                operacaoValida = true;
                return;

            } else if (operacao.equals("multiplicação") || operacao.equals("*")) {
                dividindo = valor1 * valor2;
                System.out.println("O resultado é " + dividindo);
                operacaoValida = true;
                return;

            } else if (operacao.equals("divisão") || operacao.equals("/")) {
                multiplicando = valor1 / valor2;
                System.out.println("O resultado é " + multiplicando);
                operacaoValida = true;
                return;
            } else {
                System.out.println("Sua operação não é valida");
            }
        }
    }
}
