package br.com.rogerio.pessoa_api.infra.controllers;

import br.com.rogerio.pessoa_api.core.entities.Pessoa;
import br.com.rogerio.pessoa_api.core.usercases.CreatePessoaUseCase;
import br.com.rogerio.pessoa_api.core.usercases.GetAllPessoasUseCase;
import br.com.rogerio.pessoa_api.core.usercases.GetIdPessoasUseCase;
import br.com.rogerio.pessoa_api.infra.dtos.PessoaDto;
import lombok.AllArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor

public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final GetAllPessoasUseCase getAllPessoasUseCase;
    private final GetIdPessoasUseCase getIdPessoasUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoadto) {
     Pessoa pessoa = pessoaDtoMapper.toPessoa(pessoadto);
     Pessoa novapessoa =createPessoaUseCase.execute(pessoa);
     return pessoaDtoMapper.toPessoaDto(novapessoa);
    }

    @GetMapping
    public List<PessoaDto> GetAllPessoas(){
        return getAllPessoasUseCase
                .execute()
                .stream()
                .map(pessoaDtoMapper::toPessoaDto)
                .collect(Collectors.toList());

    }

    @GetMapping("/{id}")
    public PessoaDto GetId(@PathVariable Long id){
        Pessoa pessoa = getIdPessoasUseCase.execute(id);
        return pessoaDtoMapper.toPessoaDto(pessoa);
    }
}
