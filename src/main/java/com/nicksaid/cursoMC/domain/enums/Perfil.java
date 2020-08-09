package com.nicksaid.cursoMC.domain.enums;

public enum Perfil {
	
	ADMIN(1,"ROLE_ADMIN"),
	CLIENTE(2,"ROLE_CLIENTE");
	
	private int cod;
	private String descricao;
	
	private Perfil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {	//Só para proteger esse if!
			return null;
		}
		
		for (Perfil x : Perfil.values()) {
			if (cod.equals(x.getCod())) {
				return x; //Se informar codigo 1 o metodo retornará PESSOAFISICA, se não retornará o PESSOAJURIDICA!
			}
		}
	
	
	throw new IllegalArgumentException("Id inválido " + cod);//caso apareça um ID inválido!
	}

}
