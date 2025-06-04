package Model;

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // Função para cadastrar aluno
    public void cadastrarAluno(Aluno aluno) {
        System.out.println("\nAluno " + aluno.getNome() + " cadastrado com sucesso.");
    }

    // Função para registrar pagamento
    public void registrarPagamento(Pagamento pagamento) {
        System.out.println("\nPagamento de R$" + pagamento.getValor() + " registrado pelo método " + pagamento.getMetodo());
    }

    // Função para criar treino
    public void criarTreino(Aluno aluno, Treino treino) {
        aluno.adicionarTreino(treino);
        System.out.println("\nTreino com objetivo " + treino.getObjetivo() + " criado para o aluno " + aluno.getNome());
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
