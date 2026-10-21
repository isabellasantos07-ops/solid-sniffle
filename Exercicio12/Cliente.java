import java.util.Objects;

public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                          // mesma referência
        if (obj == null || getClass() != obj.getClass()) return false;  // nulo ou classe diferente

        Cliente outro = (Cliente) obj;
        return Objects.equals(this.cpf, outro.cpf);            // compara só o CPF
    }
}