package Exercicio01;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Informe a altura (em metros)");
		altura = reader.nextDouble();
		
		System.out.println("Informe a base (em metros)");
		base = reader.nextDouble();
		
		area = base*altura/2;
		
		System.out.println("A área do triângulo é: " + area);
	}

}
