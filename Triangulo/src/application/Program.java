package application;

import java.util.Scanner;

import entities.triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		triangulo x, y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("Informe os dados do triangulo X:\n ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os dados do triangulo Y:\n");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();	//coloca o resultado do m�todo no areaX
		double areaY = y.area();	//coloca o resultado do m�todo na areaY
		
		System.out.println("A area do triangulo X �: "+areaX);
		System.out.println("A area do triangulo Y �: "+areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior area � X");
		}else {
			System.out.println("A maior area � Y");
		}
		
		sc.close();
	}

}
