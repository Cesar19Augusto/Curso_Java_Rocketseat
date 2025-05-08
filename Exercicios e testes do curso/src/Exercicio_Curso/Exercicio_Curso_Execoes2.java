package Exercicio_Curso;

import java.text.NumberFormat;
import java.text.ParseException;

public class Exercicio_Curso_Execoes2 {
        public static void main(String[] args) throws ParseException {
            Number valor = 0 ;
            try {
                valor = Double.valueOf("a1.75");
                valor = NumberFormat.getInstance().parse("a1.75");
            } catch (NumberFormatException error){
                System.err.println("Erro: A entrada não está no formato numérico correto!");
            }

        }
}
