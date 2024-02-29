package Exercicio01;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int number;
		String name;	
		
		System.out.println("Digite sua idade");
		number = reader.nextInt();
		
		reader.nextLine(); // serve para limpar o buffer, para não bugar o scanner.
		// Só acontece quando é lido um número e depois uma string.
		
		System.out.println("Digite seu nome");
		name = reader.nextLine();
		
		System.out.println("Nome: 	" + name + "\nIdade: 	" + number);

	}

}
