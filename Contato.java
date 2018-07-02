
public class Contato
{
    String nome;
    long telefone;
    String email;
    
    public Contato(String nome, long telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public long getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
}
