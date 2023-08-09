package com.api.cadastrocrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cadastros")
public class CadastroModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 200, nullable = false)
  private String street;

  @Column(length = 50, nullable = false)
  private String city;

  @Column(length = 50, nullable = false)
  private String state;   

  @Column(length = 50, nullable = false)
  private String neighborhood;

  @Column(length = 8, nullable = false)
  private String number;

  @Column(length = 10, nullable = false)
  private String zipCode;
  
}
