import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> lista = new ArrayList<>();
    private int proximoID = 1;

    public Biblioteca(){
        lista.add(new Livro(proximoID++, "O Programador Pragmático", "Andrew Hunt"));
        lista.add(new Livro(proximoID++, "Clean Code","Robert C. Martin"));
        lista.add(new Livro(proximoID++, "Java: Como Programar", "Deitel & Deitel"));
    }
    public void adicionarLivro(String titulo, String autor){
        lista.add(new Livro(proximoID++, titulo, autor));
    }

    public List<Livro> getLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro: lista){
            if (livro.isDisponivel()){
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }
    public Livro emprestarLivroPorId(int id){
        for (Livro livro : lista){
            if (livro.getId() == id && livro.isDisponivel()){
                livro.setDisponivel(false);
                return livro;
            }
        }
        return null;
    }
    public void listarLivros(){
        for (Livro livro : lista){
            System.out.println(livro);
        }
    }
}
