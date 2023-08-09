package com.api.cadastrocrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.cadastrocrud.model.CadastroModel;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {
  
}
