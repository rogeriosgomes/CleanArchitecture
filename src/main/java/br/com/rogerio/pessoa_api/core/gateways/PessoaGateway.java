package br.com.rogerio.pessoa_api.core.gateways;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    List<Pessoa> getAllPessoa();

    Pessoa GetId(Long id);

    Pessoa findByCpfCnpj(String cpfCnpj);
}
