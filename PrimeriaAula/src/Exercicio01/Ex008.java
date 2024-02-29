package Exercicio01;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number, i, sum;
		i = 0;
		sum = 0;
		while(i < 5) {
			System.out.println("Infome um número: ");
			number = reader.nextInt();
			sum += number;
			i++;
		}
		System.out.println("Soma = " + sum);

	}

}
