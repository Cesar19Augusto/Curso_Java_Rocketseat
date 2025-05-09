import java.util.List;
import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner visual = new Scanner(System.in);
        System.out.println("**Bem-vindo à Livraria ☕ Java da Rocketset**");

        while (true) {
            System.out.println("Deseja ver os livros disponíveis ? (y/n)");
            String querVer = visual.next();

            if (querVer.equalsIgnoreCase("y")) {
                visual.nextLine();
                System.out.println("Livros disponíveis:");
                biblioteca.listarLivros();

                System.out.println("Deseja fazer o cadastro de algum livro? (y/n)");
                String querCadastro = visual.next();

                if (querCadastro.equalsIgnoreCase("y")) {
                    visual.nextLine(); // limpar o buffer
                    System.out.println("Informe o nome do livro");
                    String titulo = visual.nextLine();
                    System.out.println("Informe o nome do autor:");
                    String autor = visual.nextLine();
                    biblioteca.adicionarLivro(titulo, autor);
                    System.out.println("Livro cadastrado");
                    System.out.println("Livros disponiveis Atualizados: ");
                    biblioteca.listarLivros();
                }

                System.out.println("Deseja pegar algum livro emprestado? (y/n)");
                String querPegarLivro = visual.next();

                if (querPegarLivro.equalsIgnoreCase("y")) {
                    System.out.println("Informe o ID do livro solicitado:");
                    int idLivro = visual.nextInt();
                    Livro emprestado=biblioteca.emprestarLivroPorId(idLivro);
                    if (emprestado !=null){
                        System.out.println("Livro emprestado com sucesso: " + emprestado.getTitulo());
                    } else {
                        System.out.println("❌ Livro não disponível ou ID inválido.");
                    }
                }

            } else {
                System.out.println("Obrigado por procurar a livraria ☕ Java da Rocketseat, volte sempre!");
                break;
            }
        }
    }
}


