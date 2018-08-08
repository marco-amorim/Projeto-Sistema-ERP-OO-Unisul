package projetopoo;

public class Funcionario extends Pessoa {

    private String cargo;
    private double custoRateio;

    public double getCustoRateio() {
        return custoRateio;
    }

    public void setCustoRateio(double custoRateio) {
        this.custoRateio = custoRateio;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String paraString() {
        return getNome() + " | " + getEndereco() + " | " + super.getContato().getEmail() + " | " + super.getContato().getTelefone() + " | " + getCargo() + " | " + getCustoRateio();
    }
}
