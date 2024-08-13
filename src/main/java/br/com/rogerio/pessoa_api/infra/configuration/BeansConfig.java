package br.com.rogerio.pessoa_api.infra.configuration;

import br.com.rogerio.pessoa_api.core.gateways.PessoaGateway;
import br.com.rogerio.pessoa_api.core.usercases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public GetAllPessoasUseCase getAllPessoasUseCase(PessoaGateway pessoaGateway){
        return new GetAllPessoasUseCaseImpl(pessoaGateway);
    }

    @Bean
    public GetIdPessoasUseCase getIdPessoasUseCase(PessoaGateway pessoaGateway){
        return new GetIdPessoasUseCaseImpl(pessoaGateway);
    }

}
