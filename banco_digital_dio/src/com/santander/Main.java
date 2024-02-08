package com.santander;

public class Main {
    public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.setCliente(cliente2);
		banco.setConta(cc);
		cp.setCliente(cliente);
		banco.setConta(cp);
		System.out.println(banco.getConta());
	}

}
