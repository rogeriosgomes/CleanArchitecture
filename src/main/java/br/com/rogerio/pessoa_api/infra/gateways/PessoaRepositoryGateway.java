package br.com.rogerio.pessoa_api.infra.gateways;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.exceptions.BusinessException;
import br.com.rogerio.pessoa_api.core.gateways.PessoaGateway;
import br.com.rogerio.pessoa_api.infra.persistence.PessoaEntiity;
import br.com.rogerio.pessoa_api.infra.persistence.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        PessoaEntiity pessoaEntiity = pessoaEntityMapper.toPessoaEntity(pessoa);
        PessoaEntiity novaPessoa = pessoaRepository.save(pessoaEntiity);

        return pessoaEntityMapper.toPessoa(novaPessoa);
    }

    @Override
    public Pessoa findByCpfCnpj(String cpfCnpj) {
        return pessoaRepository.findByCpfCnpj(cpfCnpj);
    }

    @Override
    public List<Pessoa> getAllPessoa() {
        return pessoaRepository
                .findAll()
                .stream()
                .map(pessoaEntityMapper::toPessoa)
                .collect(Collectors.toList());
    }

    @Override
    public Pessoa GetId(Long id) {
       PessoaEntiity pessoaEntiity = pessoaRepository.findById(id).orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));
       return pessoaEntityMapper.toPessoa(pessoaEntiity);
    }
}
