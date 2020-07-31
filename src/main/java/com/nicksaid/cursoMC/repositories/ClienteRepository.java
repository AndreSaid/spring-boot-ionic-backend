package com.nicksaid.cursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicksaid.cursoMC.domain.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

	}


