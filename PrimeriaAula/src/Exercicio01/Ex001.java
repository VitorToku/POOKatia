package Exercicio01;

public class Ex001 {

	public static void main(String[] args) {
		String apresentacao = "Prazer, sou o vitor";
		Imprimir(apresentacao);
		System.out.println(Somar(1,2));
	}
	
	public static void Imprimir(String palavra) {
		System.out.println(palavra);
	}
	
	public static int Somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
}
