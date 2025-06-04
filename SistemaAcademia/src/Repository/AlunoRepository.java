package Repository;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }

    public Aluno buscarPorCpf(String cpf) {
        return alunos.stream()
                .filter(a -> a.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }
}
