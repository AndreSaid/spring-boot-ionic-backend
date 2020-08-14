package com.nicksaid.cursoMC.dto;

import java.io.Serializable;

import com.nicksaid.cursoMC.domain.Estado;

public class EstadoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public EstadoDTO() {
	}

	public EstadoDTO(Estado obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return nome;
	}

	public void setEstado(String estado) {
		this.nome = estado;
	}

}
