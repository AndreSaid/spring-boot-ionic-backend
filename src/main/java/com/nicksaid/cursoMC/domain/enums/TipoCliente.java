package com.nicksaid.cursoMC.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {	//Só para proteger esse if!
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x; //Se informar codigo 1 o metodo retornará PESSOAFISICA, se não retornará o PESSOAJURIDICA!
			}
		}
	
	
	throw new IllegalArgumentException("Id inválido " + cod);//caso apareça um ID inválido!
	}
	
}
