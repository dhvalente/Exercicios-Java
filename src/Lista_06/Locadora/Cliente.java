package Lista_06.Locadora;

public class Cliente {

    private String nome;
    private Long cpf;

    public Cliente(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Long getCpf() {
        return cpf;
    }
}