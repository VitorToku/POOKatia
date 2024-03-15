package veiculos;

public class Moto extends Veiculo {
	private int cilindradas;
	
	Moto(){
		
	}
	
	Moto(String modelo , int ano, double preco, Pessoa proprietario, int cilindradas){
		this.setModelo(modelo);
		this.setAnoDeFabricacao(ano);
		this.setPreco(preco);
		this.setProprietario(proprietario);
		this.cilindradas = cilindradas;
		this.setDisponivel(false);
	}
	
	Moto(String modelo , int ano, double preco, int cilindradas){
		this.setModelo(modelo);
		this.setAnoDeFabricacao(ano);
		this.setPreco(preco);		
		this.cilindradas = cilindradas;
		this.setDisponivel(true);
	}

}
