package Model;

public class Plano {
    private String nome;
    private double preco;
    private int duracaoDias;

    public Plano(String nome, double preco, int duracaoDias) {
        this.nome = nome;
        this.preco = preco;
        this.duracaoDias = duracaoDias;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }
}