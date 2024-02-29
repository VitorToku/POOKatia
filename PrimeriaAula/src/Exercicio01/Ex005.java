package Exercicio01;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int age;
		System.out.println("Informe sua idade: ");
		age = reader.nextInt();		
		if(age<16) {
			System.out.println("O indivíduo não pode votar");
		} else if (age>=18 && age<=65 ){
			System.out.println("O indivíduo deve votar");
		} else {
			System.out.println("O voto é optativo");
		}

	}

}
