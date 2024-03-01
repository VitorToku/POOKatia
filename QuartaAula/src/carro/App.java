package carro;

public class App {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", 30254.54f);
		System.out.println(carro.calcularValorVenda(carro.valorFipe));
	}

}
