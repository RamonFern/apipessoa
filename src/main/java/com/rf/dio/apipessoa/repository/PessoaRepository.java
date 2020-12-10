package com.rf.dio.apipessoa.repository;

import com.rf.dio.apipessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
