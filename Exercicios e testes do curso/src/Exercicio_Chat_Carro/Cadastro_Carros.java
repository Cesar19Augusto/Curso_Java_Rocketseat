package Exercicio_Chat_Carro;

public class Cadastro_Carros {
    public static void main(String[] args) {
        Exercicios_Chat_07_Carro Opala = new Exercicios_Chat_07_Carro("Chevrolet", 1968);
        Exercicios_Chat_07_Carro Gol = new Exercicios_Chat_07_Carro("Volkswagen",1990);
        Exercicios_Chat_07_Carro Uno = new Exercicios_Chat_07_Carro("Fiat",2004);
        Exercicios_Chat_07_Carro Fiesta = new Exercicios_Chat_07_Carro("Ford",2006);

        System.out.println("Carro Cadastrado: " + Opala);
        System.out.println("Carro Cadastrado: " + Gol);
        System.out.println("Carro Cadastrado: " + Uno);
        System.out.println("Carro Cadastrado: " + Fiesta);
    }
}
