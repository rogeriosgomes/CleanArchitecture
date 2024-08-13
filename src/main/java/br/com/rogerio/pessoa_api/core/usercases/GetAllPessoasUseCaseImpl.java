package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.gateways.PessoaGateway;

import java.util.List;

public class GetAllPessoasUseCaseImpl implements GetAllPessoasUseCase{

    private final PessoaGateway pessoaGateway;

    public GetAllPessoasUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }


    @Override
    public List<Pessoa> execute() {
        return pessoaGateway.getAllPessoa();
    }
}
