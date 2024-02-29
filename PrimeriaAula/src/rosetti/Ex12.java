package rosetti;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("Digite um número de 1 a 10");
		Scanner scan = new Scanner(System.in);
		int numero;
		
		numero = scan.nextInt();
		
		tabuadaDe(numero);

	}
	
	static public void tabuadaDe(int numero) {
		System.out.println("Tabuada de " + numero + ":");
		for(int i = 0; i<=10; i++) {
			System.out.println( numero + " X " + i + " = " + numero*i);
		}
	}

}
