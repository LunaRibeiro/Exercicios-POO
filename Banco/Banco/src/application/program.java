package application;

import java.util.Scanner;

import entities.conta;


public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		conta Conta;
		
		System.out.println("Insira o n�mero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Insira o nome do titular: ");
		String titular = sc.next();
		System.out.println("Ter� dep�sito inicial (S/N)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.println("Insira o valor inicial: ");
			double saldoInicial = sc.nextDouble();
			Conta = new conta(numero, titular, saldoInicial); 
		}else {
			Conta = new conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Conta:");
		System.out.println(Conta);
		
		System.out.println();
		System.out.println("Entre com o valor para dep�sito: ");
		double valorDepositado = sc.nextDouble();
		Conta.deposito(valorDepositado);
		System.out.println();
		System.out.println("Conta atualizada: ");
		System.out.println(Conta);
		
		System.out.println();
		System.out.println("Entre com o valor para sacar: ");
		double valorSaque = sc.nextDouble();
		Conta.saque(valorSaque);
		System.out.println();
		System.out.println("Conta atualizada: ");
		System.out.println(Conta);
		
		sc.close();
	}

}
