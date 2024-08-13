package br.com.rogerio.pessoa_api.core.usercases;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoasUseCase {
    public List<Pessoa> execute();
}
