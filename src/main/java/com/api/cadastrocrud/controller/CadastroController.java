package com.api.cadastrocrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cadastrocrud.model.CadastroModel;
import com.api.cadastrocrud.repository.CadastroRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cadastros")
@AllArgsConstructor
public class CadastroController {

  private final CadastroRepository cadastroRepository;

  @GetMapping
  public List<CadastroModel> list() {
    return cadastroRepository.findAll();
  }
}
