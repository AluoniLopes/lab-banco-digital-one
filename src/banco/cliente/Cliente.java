package banco.cliente;

public class Cliente {

    private final String nome;
    private final String cpf;

    public Cliente(String name, String cpf) {
        this.nome = name;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
    }

}