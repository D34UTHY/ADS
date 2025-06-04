package Controller;

import Model.Aluno;
import Model.Treino;
import Repository.TreinoRepository;
import Service.TreinoService;

public class TreinoController {
    private TreinoService treinoService;

    public TreinoController() {
        this.treinoService = new TreinoService(new TreinoRepository());
    }

    public void criarTreinoParaAluno(Aluno aluno, Treino treino) {
        treinoService.criarTreinoParaAluno(aluno, treino);
        System.out.println("\nTreino criado e atribuído ao aluno.");
    }
}
