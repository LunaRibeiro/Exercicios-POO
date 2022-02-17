package entities;

public class conta {

	private int numero;
	private String titular;
	private double saldo;
	
	
	public conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public conta(int numero, String titular, double saldoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(saldoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double dinheiro) {
		saldo += dinheiro;
	}
	
	public void saque (double dinheiro) {
		saldo -= dinheiro + 5;
	}
	
	public String toString() {
		return "Conta"
				+ numero
				+ ", Titular: "
				+ titular
				+ ", Saldo: $"
				+ String.format("%.2f", saldo);
	}
}
