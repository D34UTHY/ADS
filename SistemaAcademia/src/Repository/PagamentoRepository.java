package Repository;

import Model.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void registrar(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public List<Pagamento> listarTodos() {
        return pagamentos;
    }
}
