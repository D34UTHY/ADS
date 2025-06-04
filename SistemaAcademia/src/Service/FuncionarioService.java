package Service;

import Model.Funcionario;
import Model.Pagamento;
import Repository.FuncionarioRepository;
import Repository.PagamentoRepository;

public class FuncionarioService {
    private FuncionarioRepository funcionarioRepo;
    private PagamentoRepository pagamentoRepo;

    public FuncionarioService(FuncionarioRepository funcionarioRepo, PagamentoRepository pagamentoRepo) {
        this.funcionarioRepo = funcionarioRepo;
        this.pagamentoRepo = pagamentoRepo;
    }

    public void registrarPagamento(Pagamento pagamento) {
        pagamentoRepo.registrar(pagamento);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioRepo.salvar(funcionario);
    }
}
