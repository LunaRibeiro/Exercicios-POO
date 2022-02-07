package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
/*Fazer um programa para ler os valores da largura e altura
de um ret�ngulo. Em seguida, mostrar na tela o valor de
sua �rea, per�metro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA: "+rectangle.area());
		System.out.println("PERIMETER: "+rectangle.perimeter());
		System.out.println("DIAGONAL: "+rectangle.diagonal());
		
		
		
		
		
		sc.close();

	}

}
