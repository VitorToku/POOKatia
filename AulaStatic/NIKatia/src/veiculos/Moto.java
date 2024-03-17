package veiculos;

public class Moto extends Veiculo {
	private int cilindradas;
	
	// Construtor vazio
	Moto(){}
	
	// Construtor declarando proprietário (deixa o atributo "Disponível" como false)
	Moto(String modelo , int ano, double preco, Pessoa proprietario, int cilindradas){
		this.setModelo(modelo);
		this.setAnoDeFabricacao(ano);
		this.setPreco(preco);
		this.setProprietario(proprietario);
		this.cilindradas = cilindradas;
		this.setDisponivel(false);
	}

	// Construtor sem declarar proprietário (deixa o atributo "Disponível" como true)
	Moto(String modelo , int ano, double preco, int cilindradas){
		this.setModelo(modelo);
		this.setAnoDeFabricacao(ano);
		this.setPreco(preco);		
		this.cilindradas = cilindradas;
		this.setDisponivel(true);
	}

	// toString para realizar os testes e printar as propriedades da Moto
	@Override
	public String toString() {
		String str = 
				"Moto: \nModelo: "+ this.getModelo() +
				"\nAno de fabricação: " + this.getAnoDeFabricacao() +
				"\nPreço: " +this.getPreco();
		if(this.isDisponivel()) {
			str+= "\nProprietário: Sem dono";
		}else{
			str+= "\nProprietário: " + this.getProprietario().getNome();			
		}
		return str;
	}	

}
