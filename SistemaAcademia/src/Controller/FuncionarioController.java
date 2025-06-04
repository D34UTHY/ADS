package Controller;

import Model.Funcionario;
import Model.Pagamento;
import Repository.FuncionarioRepository;
import Repository.PagamentoRepository;
import Service.FuncionarioService;

public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController() {
        this.funcionarioService = new FuncionarioService(
                new FuncionarioRepository(),
                new PagamentoRepository()
        );
    }

    public void registrarPagamento(Pagamento pagamento) {
        funcionarioService.registrarPagamento(pagamento);
        System.out.println("\nPagamento registrado com sucesso.");
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioService.cadastrarFuncionario(funcionario);
        System.out.println("\nFuncionário cadastrado com sucesso.");
    }
}
