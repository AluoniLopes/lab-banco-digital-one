package banco.conta;

import banco.Banco;
import banco.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato() {
        System.out.println("======EXTRATO CORRENTE======");
        super.imprimirInfosComuns();
        System.out.println("===========================");

    }
}