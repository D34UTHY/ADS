package Service;

import Model.Aluno;
import Model.Aula;
import Repository.AlunoRepository;

public class AlunoService {
    private AlunoRepository alunoRepo;

    public AlunoService(AlunoRepository alunoRepo) {
        this.alunoRepo = alunoRepo;
    }

    public void cadastrarAluno(Aluno aluno) {
        alunoRepo.salvar(aluno);
    }

    public void agendarAula(Aluno aluno, Aula aula) {
        aluno.agendarAula(aula);
    }

    public void fazerCheckIn(Aluno aluno) {
        aluno.fazerCheckIn();
    }
}
