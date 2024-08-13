package br.com.rogerio.pessoa_api.infra.dtos;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.enums.EnumTipoPessoa;

public record PessoaDto (String nome,
                         String email,
                         String cpfCnpj,
                         EnumTipoPessoa tipo){


}
