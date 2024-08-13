package br.com.rogerio.pessoa_api.core.entities;

import br.com.rogerio.pessoa_api.core.enums.EnumTipoPessoa;

public record Pessoa(Long id,
                     String nome,
                     String email,
                     String cpfCnpj,
                     EnumTipoPessoa tipo) {
}
