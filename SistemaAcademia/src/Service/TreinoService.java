package Service;

import Model.Aluno;
import Model.Treino;
import Repository.TreinoRepository;

import java.util.List;

public class TreinoService {
    private TreinoRepository treinoRepo;

    public TreinoService(TreinoRepository treinoRepo) {
        this.treinoRepo = treinoRepo;
    }

    public void criarTreinoParaAluno(Aluno aluno, Treino treino) {
        aluno.setTreinos(treino);
        treinoRepo.salvar(treino);
    }
}
