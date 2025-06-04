package Model;

import java.util.Date;

public class Pagamento {
    private double valor;
    private Date data;
    private String metodo;

    public Pagamento(double valor, Date data, String metodo) {
        this.valor = valor;
        this.data = data;
        this.metodo = metodo;
    }

    // Getters and Setters

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
