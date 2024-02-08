package com.santander;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Conta> contas;
	private static final String NOME_BANCO = "Santander";
	private String nome;
	
	public Banco() {
		this.nome = NOME_BANCO;
		contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}
	
	public void setConta(Conta conta) {
        contas.add(conta);
    }
	public ArrayList<Conta> getConta() {
		return contas;
	}
}
