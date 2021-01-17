package com.algaworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Cidade;

@Repository
public interface Cidades extends JpaRepository<Cidade, Long> {

}
