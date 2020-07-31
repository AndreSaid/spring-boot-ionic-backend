package com.nicksaid.cursoMC.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"pendente"),
	QUITADO(2,"quitado"),
	CANCELADO(3,"cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {	//Só para proteger esse if!
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x; //Se informar codigo 1 o metodo retornará PESSOAFISICA, se não retornará o PESSOAJURIDICA!
			}
		}
	
	
	throw new IllegalArgumentException("Id inválido " + cod);//caso apareça um ID inválido!
	}

}
