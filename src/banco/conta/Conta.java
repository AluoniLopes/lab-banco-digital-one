package banco.conta;

import banco.Banco;
import banco.cliente.Cliente;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, Banco banco) {
        this.banco = banco;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        System.out.println(String.format(
                "%s: Conta Ag:%d Nº %d para Sr(a). %s criado com sucesso! ",
                banco.getNome(), agencia, numero, cliente.getNome()));
    }

    protected Banco banco;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    @Override
    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println(String.format("Sucesso. Saldo atual: R$%.2f", this.saldo));
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("depositar: Sucesso. Saldo atual: R$%.2f", this.saldo));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            contaDestino.depositar(valor);
            System.out.println(String.format("Transferido para %s com sucesso.",
                    contaDestino.getCliente().getNome()));

            System.out.println(String.format("Novo saldo: %.2f ", this.saldo));
        }
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo
                + ", cliente=" + cliente.getNome() + "]";
    }

}