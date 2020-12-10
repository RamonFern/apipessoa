package com.rf.dio.apipessoa.service;

import com.rf.dio.apipessoa.dto.response.MessageResponseDTO;
import com.rf.dio.apipessoa.entity.Pessoa;
import com.rf.dio.apipessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    @Autowired
    PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public MessageResponseDTO createPessoa(Pessoa pessoa){
        Pessoa pessoaSalva = pessoaRepository.save(pessoa);
        return MessageResponseDTO
                .builder()
                .message("Criada uma Pessoa com o id = " +pessoaSalva.getId())
                .build();
    }
}
