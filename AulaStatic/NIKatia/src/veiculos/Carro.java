package veiculos;

public class Carro extends Veiculo{
	private int numeroPortas;
	
	// Construtor vazio
	Carro(){}
	
	// Construtor declarando proprietário (deixa o atributo "Disponível" como false)
	Carro(String modelo , int ano, double preco, Pessoa proprietario, int numeroPortas){
			this.setModelo(modelo);
			this.setAnoDeFabricacao(ano);
			this.setPreco(preco);
			this.setProprietario(proprietario);
			this.numeroPortas = numeroPortas;
			this.setDisponivel(false);
		}
	
	// Construtor sem declarar proprietário (deixa o atributo "Disponível" como true)
	Carro(String modelo , int ano, double preco, int numeroPortas){
			this.setModelo(modelo);
			this.setAnoDeFabricacao(ano);
			this.setPreco(preco);		
			this.numeroPortas = numeroPortas;
			this.setDisponivel(true);
	}

	// toString para realizar os testes e printar as propriedades do Carro
	@Override
	public String toString() {
		String str = 
				"Carro: \nModelo: "+ this.getModelo() +
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
