package projetopoo;

public class Item {
    private String tipo;
    private double custo;
    private String extra;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    public String paraString(){
        return  getTipo() + " | " +getCusto() + " | " + getExtra(); 
    }

}
