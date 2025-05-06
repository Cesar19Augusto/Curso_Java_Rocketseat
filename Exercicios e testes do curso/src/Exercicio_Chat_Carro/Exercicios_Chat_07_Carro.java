package Exercicio_Chat_Carro;
/* Seção 7 – JavaBeans e Convenções
Exercício:
-Crie uma classe Carro com:
-Atributos privados: marca (String) e ano (int).
-Métodos getMarca, setMarca, getAno, setAno.
-Objetivo: Aplicar padrão JavaBeans corretamente.
*/

public class Exercicios_Chat_07_Carro {
    private String marca;
    private int ano;

    Exercicios_Chat_07_Carro(String marca, int ano){
        this.marca =  marca;
        this.ano = ano;
    }
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
}
