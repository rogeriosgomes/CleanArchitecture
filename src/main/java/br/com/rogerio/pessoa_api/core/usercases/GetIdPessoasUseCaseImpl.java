package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.gateways.PessoaGateway;

public class GetIdPessoasUseCaseImpl implements GetIdPessoasUseCase{

    private final PessoaGateway pessoaGateway;

    public GetIdPessoasUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }


    @Override
    public Pessoa execute(Long id) {
        return pessoaGateway.GetId(id);
    }
}
