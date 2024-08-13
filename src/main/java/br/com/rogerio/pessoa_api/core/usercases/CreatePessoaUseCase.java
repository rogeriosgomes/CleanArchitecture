package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;


public interface CreatePessoaUseCase {
    public Pessoa execute(Pessoa pessoa);
}
