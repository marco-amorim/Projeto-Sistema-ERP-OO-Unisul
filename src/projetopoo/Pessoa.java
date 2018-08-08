package projetopoo;


public class Pessoa {
    
    private String nome;
    private String Endereco;
    private Contato contato;
   
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
