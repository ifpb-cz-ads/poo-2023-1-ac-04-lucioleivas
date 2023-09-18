package atividade04;

public class conta {
	String nome_titular;
	int numero_conta;
	double saldo;
	
	public boolean sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo+=valor;
		
	}
}
