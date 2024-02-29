package Exercicio01;

import java.util.Scanner;

public class Ex006 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		float amountOfFuel, price;
		price = 0;
		String option;
		System.out.println("Informe a quantidade de litros de combustível");
		amountOfFuel = reader.nextFloat();
		System.out.println("Escolha a opção: \n A: Álcool \n G: Gasolina \n D: Diesel");
		
		reader.nextLine();
		option = reader.nextLine();
		
		switch(option) {
		case "A":
			price = amountOfFuel * 4.58f;
			break;
		case "G":
			price = amountOfFuel * 6.89f;
			break;
		case "D":
			price = amountOfFuel * 4.75f;
			break;
		}			
		System.out.println("Preço: R$" + price);
		
		}
	
	}
	


