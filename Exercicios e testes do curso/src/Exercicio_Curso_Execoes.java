import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

    public class Exercicio_Curso_Execoes {
        public static void main(String[] args) {
            int idade = 0 ;
            double altura = 0.0;
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();
            while (idade <= 0) {
                try {
                    System.out.println("Digite sua idade");
                    idade = scanner.nextInt();
                } catch (InputMismatchException erro) {
                    System.err.println("Erro: Você precisa digitar um número inteiro válido!");
                    scanner.next();
                }
            }
            while (altura <=0.0){
                try {
                    System.out.println("Digite sua altura");
                    altura = scanner.nextDouble();
                } catch (InputMismatchException erro) {
                    System.err.println("Erro: Você precisa digitar uma altura válida!");
                    scanner.next();
                }
            }

             //imprimindo os dados obtidos pelo usuario
             System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
             System.out.println("Tenho " + idade + " anos ");
             System.out.println("Minha altura é " + altura + "cm ");
             scanner.close();
        }
    }


