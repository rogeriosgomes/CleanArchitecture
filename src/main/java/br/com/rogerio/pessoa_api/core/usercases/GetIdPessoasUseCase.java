package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;



public interface GetIdPessoasUseCase {
    public Pessoa execute(Long id);
}
