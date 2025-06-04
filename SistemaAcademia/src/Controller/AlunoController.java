package Controller;

import Model.Aluno;
import Model.Aula;
import Repository.AlunoRepository;
import Service.AlunoService;

public class AlunoController {
    private AlunoService alunoService;

    public AlunoController() {
        this.alunoService = new AlunoService(new AlunoRepository());
    }

    public void cadastrarAluno(Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
        System.out.println("\nAluno cadastrado com sucesso.");
    }

    public void agendarAula(Aluno aluno, Aula aula) {
        alunoService.agendarAula(aluno, aula);
        System.out.println("\nAula agendada com sucesso.");
    }

    public void fazerCheckIn(Aluno aluno) {
        alunoService.fazerCheckIn(aluno);
        System.out.println("\nCheck-in realizado com sucesso.");
    }
}
