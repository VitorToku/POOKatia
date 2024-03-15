package veiculos;

public class TesteVeiculos {

	public static void main(String[] args) {
		//Cria uma moto sem proprietário 
		
		Moto moto = new Moto("LKX-3021", 2015, 50.540, 50);
		
		//Cria um carro e uma pessoa que é dona dele
		
		Pessoa pessoa = new Pessoa("Vitor", 1594683, 25);
		
		Carro carro = new Carro("Uno", 2016, 40.054, pessoa, 4);
		
		//Vende a moto criada
		moto.vender();
	}

}
