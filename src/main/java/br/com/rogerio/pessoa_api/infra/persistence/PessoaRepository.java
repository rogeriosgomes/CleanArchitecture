package br.com.rogerio.pessoa_api.infra.persistence;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<PessoaEntiity, Long> {
    Pessoa findByCpfCnpj(String cpfCnpj);
}
