package banco;

import java.util.HashSet;
import java.util.Set;

import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Banco {
    // TODO criar implementacao de mostrar contas poupancas e contas correntes
    // separadamente;
    private String nome;
    private Set<Conta> contas; // nao permite contas repetidas

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void apagarConta(Conta conta) {
        contas.remove(conta);
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public Conta CriarCorrente(Cliente cliente) {
        ContaCorrente conta = new ContaCorrente(cliente, this);
        addConta(conta);
        return conta;
    }

    public Conta CriarPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente, this);
        addConta(conta);
        return conta;
    }

    private void addConta(Conta conta) {
        this.contas.add(conta);
    }

}