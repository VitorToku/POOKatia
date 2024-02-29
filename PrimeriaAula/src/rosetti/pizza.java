package rosetti;

import java.util.Scanner;

public class pizza {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double angulo ;
		double pedacos = 0;
		int numeroDePizzas = 1;
		boolean pizzaDividida = true;
		
		angulo = scan.nextDouble();
		
		while(pizzaDividida) {			
			
			if (360 * numeroDePizzas % angulo != 0) {
				numeroDePizzas++;
				System.out.println("Mais uma pizza, total: " + numeroDePizzas);
			}else {
					pizzaDividida = false;
			}
		}
		
		System.out.println(numeroDePizzas * 360 / angulo);
		
		
		

	}

}
