package com.bytebank.modelo;

public class CuentaAhorros extends Cuenta {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}
	public void Ahorro(double valor){
		this.saldo += valor+(valor*.1); 
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
