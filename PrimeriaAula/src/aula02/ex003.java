package aula02;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] entradas = new int[2];
		
		System.out.println("Digite 10 números");
		
		for(int i = 0;i < entradas.length;i++) {
			entradas[i] = ler.nextInt();
		}
		
		for (int i : entradas) {
			if (i > 30 && i <90) {
				System.out.println(i);
			}
		}
		
	}
 
}
