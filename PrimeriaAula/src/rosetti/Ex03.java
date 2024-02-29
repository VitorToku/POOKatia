package rosetti;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		String nome;
		String sexo,estadoCivil;
		int idade;
		double salario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");		
		nome = scan.nextLine();		
		
		System.out.println("Digite o seu sexo(f ou m): ");		
		sexo = scan.nextLine();		
		
		System.out.println(sexo);
		
		System.out.println("Digite o seu estado civil(s, c, v ou d): ");		
		estadoCivil = scan.nextLine();
		
		System.out.println(estadoCivil);
		
		System.out.println("Digite o sua idade: ");		
		idade = scan.nextInt();
		
		System.out.println("Digite o seu salario: ");		
		salario = scan.nextDouble();
		
		Funcionario ze = new Funcionario(nome, sexo, estadoCivil, idade, salario); 
		
		System.out.println(ze.verificarDados());

	}

}
