package br.com.rogerio.pessoa_api.infra.gateways;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.infra.persistence.PessoaEntiity;
import br.com.rogerio.pessoa_api.infra.persistence.PessoaRepository;
import org.springframework.stereotype.Component;

@Component
public class PessoaEntityMapper {

    private final PessoaRepository pessoaRepository;

    public PessoaEntityMapper(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaEntiity toPessoaEntity(Pessoa pessoa) {
        return new PessoaEntiity(pessoa.id(),
                pessoa.nome(),
                pessoa.email(),
                pessoa.cpfCnpj(),
                pessoa.tipo());
    }

    public Pessoa toPessoa(PessoaEntiity pessoaEntiity) {
        return new Pessoa(pessoaEntiity.getId(),
                pessoaEntiity.getNome(),
                pessoaEntiity.getEmail(),
                pessoaEntiity.getCpfCnpj(),
                pessoaEntiity.getTipo());
    }
}
