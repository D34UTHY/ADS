package Model;

public class Administrador extends Funcionario {

    public Administrador(String nome, String cargo) {
        super(nome, cargo);
    }

    public void gerenciarPlanos() {
        System.out.println("Gerenciando planos...");
    }

    public void gerarRelatorios() {
        System.out.println("Gerando relatórios...");
    }
}
