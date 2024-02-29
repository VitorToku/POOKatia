package Exercicio01;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num1, num2;
		System.out.println("Informe um número: ");
		num1 = reader.nextInt();
		System.out.println("Informe outro número: ");
		num2 = reader.nextInt();
		
		if(num1>num2) {
			System.out.println("Num1 é maior que Num2");
		} else {
			System.out.println("Num1 é menor que Num2");
		}
	}

}
