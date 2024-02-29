package aula02;

import java.util.Scanner;

public class postoGasolina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tipoCombustivel;
		double alcool, diesel, gasolina, quantidade, preco ;
		alcool = 1.7997;
		diesel = 0.9798;
		gasolina = 2.1009;
		preco = 0.0;
		System.out.println("Escolha o tipo de combustível que você quer");
		System.out.println("A - Alcool");
		System.out.println("D - Diesel");
		System.out.println("G - Gasolina");
		
		tipoCombustivel = scan.nextLine();
		
		System.out.println("Quantos litros?");
		
		quantidade = scan.nextDouble();
		
		if(tipoCombustivel.equals("A")) {
			preco = quantidade * alcool;
		} else if(tipoCombustivel.equals("G")) 
		{
			preco = quantidade * gasolina;
			
		} else if(tipoCombustivel.equals("D"))
		{
			preco = quantidade * diesel;
		}
				
		System.out.println("Preço: " + preco);
		

	}

}
