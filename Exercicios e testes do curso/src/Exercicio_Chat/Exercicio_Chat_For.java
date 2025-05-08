package Exercicio_Chat;/*🔁 Seção 4 – Estruturas de Repetição
Exercício:
-Crie um pequeno projeto Java (console) que resolva o seguinte problema:

🧮 Problema:
-Você foi contratado para criar um sistema simples que exiba a tabuada de multiplicação de um número
fornecido pelo usuário. Use a estrutura de repetição for.

✅ Requisitos:
-O programa deve solicitar que o usuário digite um número entre 1 e 10.
-Em seguida, deve exibir a tabuada desse número de 1 até 10.
- a estrutura for para gerar os resultados.*/

import java.util.Scanner;

public class Exercicio_Chat_For {
    public static void main(String[] args) {
        Scanner numero =  new Scanner (System.in);
        System.out.println("Digite um numero de 1 até 10: ");
        int valorUser = numero.nextInt();

        System.out.println("Tabuada do " + valorUser + ":");

        for (int i= 1 ; i <= 10; i ++){
             int resultado = valorUser * i;
            System.out.println(valorUser + " x " + i + " = " + resultado);
        }
    }
}
