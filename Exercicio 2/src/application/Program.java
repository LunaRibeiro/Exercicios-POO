package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

/*Fazer um programa para ler os dados de um funcion?rio (nome, sal?rio bruto e imposto). Em
seguida, mostrar os dados do funcion?rio (nome e sal?rio l?quido). Em seguida, aumentar o sal?rio do funcion?rio com base em uma porcentagem dada (somente o sal?rio bruto ? afetado pela porcentagem) e mostrar novamente os dados do funcion?rio.*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: "+emp);
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: "+emp);
		sc.close();

	}

}
