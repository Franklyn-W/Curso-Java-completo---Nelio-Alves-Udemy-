package exercicios.vetores.exercicioFixacao;

public class Pessoas {

    private String nome;
    private String email;
    private int nrQuarto;

    
    public Pessoas() {
    }
    
    public Pessoas(String nome, String email, int nrQuarto) {
        this.nome = nome;
        this.email = email;
        this.nrQuarto = nrQuarto;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getNrQuarto() {
        return nrQuarto;
    }
    
    public void setNrQuarto(int nrQuarto) {
        this.nrQuarto = nrQuarto;
    }

    @Override
    public String toString() {
        return nrQuarto + ": " + nome + ", " + email;
    }
    
}
