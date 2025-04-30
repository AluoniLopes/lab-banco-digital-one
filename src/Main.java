import banco.Banco;
import banco.cliente.Cliente;
import banco.conta.Conta;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santader");

        Cliente venilton = new Cliente("Venilton dos Santos", "12345678901");
        Cliente luan = new Cliente("Luan da Silva", "98765432101");

        Conta venilConta = santander.CriarCorrente(venilton);
        Conta luanConta = santander.CriarCorrente(luan);

        venilConta.depositar(500);
        venilConta.sacar(400);
        venilConta.imprimirExtrato();

        luanConta.depositar(600);
        luanConta.sacar(199);
        luanConta.imprimirExtrato();

        venilConta.transferir(120, luanConta);

        System.out.println(santander.getContas());
    }
}