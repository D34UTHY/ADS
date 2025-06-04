package app;

import Controller.AlunoController;
import Controller.FuncionarioController;
import Controller.TreinoController;
import Model.*;

import java.util.Date;

public class AcademiaApp {
    public static void main(String[] args) {
        // Criando objetos do modelo
        Plano plano = new Plano("Mensal", 99.90, 30);
        Aluno aluno = new Aluno("João", "123.456.789-00", "joao@email.com", plano);
        Treino exercicio = new Treino("Supino", 3, 12);
        Treino treino = new Treino("Hipertrofia", 3, 12);
        treino.adicionaExercicio(exercicio);
        Funcionario funcionario = new Funcionario("Carlos", "Instrutor");
        Aula aula = new Aula("08:00", "Pedro");
        Pagamento pagamento = new Pagamento(99.90, new Date(), "Cartão");

        // Instanciando controllers (cada um configura sua service e repository internamente)
        AlunoController alunoController = new AlunoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        TreinoController treinoController = new TreinoController();

        // Simulando fluxo da academia
        alunoController.cadastrarAluno(aluno); // Cadastra o Aluno
        funcionarioController.registrarPagamento(pagamento); // Registra pagamento
        treinoController.criarTreinoParaAluno(aluno, treino); // Cria o treino para o aluno

        alunoController.agendarAula(aluno, aula); // Agenda Aula
        alunoController.fazerCheckIn(aluno); // Faz o Checkin
    }
}
