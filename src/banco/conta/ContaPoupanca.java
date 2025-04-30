package banco.conta;

import banco.Banco;
import banco.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato() {
        System.out.println("======EXTRATO POUPANÇA======");
        super.imprimirInfosComuns();
        System.out.println("===========================");
    }
}