package Repository;

import Model.Treino;
import java.util.ArrayList;
import java.util.List;

public class TreinoRepository {
    private List<Treino> treinos = new ArrayList<>();

    public void salvar(Treino treino) {
        treinos.add(treino);
    }

    public List<Treino> listarTodos() {
        return treinos;
    }
}
