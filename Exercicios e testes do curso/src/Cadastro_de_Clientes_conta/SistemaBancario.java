package Cadastro_de_Clientes_conta;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana",40, TipoConta.corrente);
        Cliente cliente2 = new Cliente("José",20, TipoConta.salario);
        Cliente cliente3 = new Cliente("Roberto",30,TipoConta.poupanca);

        System.out.println("Cliente: " + cliente1.getNome() + ", com idade: " + cliente1.getIdade() + ", possui Conta: " + cliente1.getTipoConta());
        System.out.println("Cliente: " + cliente2.getNome() + ", com idade: " + cliente2.getIdade() + ", possui Conta: " + cliente2.getTipoConta());
        System.out.println("Cliente: " + cliente3.getNome() + ", com idade: " + cliente3.getIdade() + ", possui Conta: " + cliente3.getTipoConta());
    }
}
