package br.com.rogerio.pessoa_api.infra.persistence;

import br.com.rogerio.pessoa_api.core.enums.EnumTipoPessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pesssoa")
public class PessoaEntiity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private EnumTipoPessoa tipo;
}
