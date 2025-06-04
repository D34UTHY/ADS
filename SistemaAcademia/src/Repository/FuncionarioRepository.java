package Repository;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

    public Funcionario buscarPorNome(String nome) {
        return funcionarios.stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
