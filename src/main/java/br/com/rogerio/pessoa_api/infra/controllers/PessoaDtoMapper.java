package br.com.rogerio.pessoa_api.infra.controllers;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.infra.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toPessoaDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(), pessoa.tipo());
    }

    public Pessoa toPessoa(PessoaDto pessoaDto) {
        return new Pessoa(null,
                           pessoaDto.nome(),
                           pessoaDto.email(),
                           pessoaDto.cpfCnpj(),
                           pessoaDto.tipo());
    }
}
