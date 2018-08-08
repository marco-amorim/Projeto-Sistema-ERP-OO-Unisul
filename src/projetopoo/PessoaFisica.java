package projetopoo;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void validaCpf(){
    
    }
    
    public String paraString() {
        return getNome() + " | " + getCpf() + " | " + getEndereco() + " | " + super.getContato().getEmail() + " | " + super.getContato().getTelefone();
    }
}
