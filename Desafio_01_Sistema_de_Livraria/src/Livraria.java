import java.util.List;
import java.util.Scanner;

public class Livraria {
    private static Biblioteca biblioteca = new Biblioteca();
    private static Scanner visual = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("**Bem-vindo à Livraria ☕ Java da Rocketset**");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Deseja ver os livros disponíveis ?");
            System.out.println("2 - Deseja fazer o cadastro de algum livro?");
            System.out.println("3 - Deseja pegar algum livro emprestado?");
            System.out.println("4 - Finalizar.");
            int escolha = valor.nextInt();

            switch (escolha) {
                case 1:
                    livrosDisponiveis();
                    break;
                case 2:
                    CadastroLivro();
                    break;
                case 3:
                    livroEmprestado();
                    break;
                case 4:
                    System.out.println("Obrigado por procurar a livraria ☕ Java da Rocketseat, volte sempre!");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void livrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        biblioteca.listarLivros();
    }

    public static void CadastroLivro() {
        System.out.println("Informe o nome do livro");
        String titulo = visual.nextLine();
        System.out.println("Informe o nome do autor:");
        String autor = visual.nextLine();
        biblioteca.adicionarLivro(titulo, autor);
        System.out.println("Livro cadastrado");
        System.out.println("Livros disponiveis Atualizados: ");
        biblioteca.listarLivros();
    }

    public static void livroEmprestado() {
        System.out.println("Informe o ID do livro solicitado:");
        int idLivro = visual.nextInt();
        Livro emprestado = biblioteca.emprestarLivroPorId(idLivro);
        if (emprestado != null) {
            System.out.println("Livro emprestado com sucesso: " + emprestado.getTitulo());
        } else {
            System.out.println("❌ Livro não disponível ou ID inválido.");
        }
    }
}