package Cadastro_de_Clientes_conta;

public class Cliente {
    private String nome;
    private int idade;
    private TipoConta tipoConta;

    Cliente(String nome, int idade, TipoConta tipoConta){
        this.nome = nome;
        this.idade = idade;
        this.tipoConta = tipoConta;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public TipoConta getTipoConta(){
        return tipoConta;
    }

}
