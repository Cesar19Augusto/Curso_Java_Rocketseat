package Exercicio_Chat;/*Seção 3 – Tipos e Variáveis
Exercício:
-Declare uma variável int para idade e uma double para altura.
-Faça a conversão da altura para int e imprima ambos os valores.
-Objetivo: Praticar tipos primitivos e casting. */

public class Exercicio_Chat_03 {
    public static int idade = 23;
    public static double altura = 1.70;
    public static void main(String[] args){
        int altura1 = (int) altura;
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura1);
    }
}
