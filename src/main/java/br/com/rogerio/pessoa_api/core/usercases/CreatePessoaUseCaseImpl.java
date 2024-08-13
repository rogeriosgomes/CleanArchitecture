package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.exceptions.BusinessException;
import br.com.rogerio.pessoa_api.core.gateways.PessoaGateway;



public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase{

    public final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa pessoaExistente = pessoaGateway.findByCpfCnpj(pessoa.cpfCnpj());
        if(pessoaExistente != null){
            throw new BusinessException("Já existe uma pessoa com Cpf/Cnpj "+pessoa.cpfCnpj()+ " cadastrado!");
        }
        return pessoaGateway.createPessoa(pessoa);
    }
}
