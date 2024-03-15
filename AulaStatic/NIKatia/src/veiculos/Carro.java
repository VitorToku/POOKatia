package veiculos;

public class Carro extends Veiculo{
	private int numeroPortas;
		
	Carro(){
			
		}
		
	Carro(String modelo , int ano, double preco, Pessoa proprietario, int numeroPortas){
			this.setModelo(modelo);
			this.setAnoDeFabricacao(ano);
			this.setPreco(preco);
			this.setProprietario(proprietario);
			this.numeroPortas = numeroPortas;
			this.setDisponivel(false);
		}
		
	Carro(String modelo , int ano, double preco, int numeroPortas){
			this.setModelo(modelo);
			this.setAnoDeFabricacao(ano);
			this.setPreco(preco);		
			this.numeroPortas = numeroPortas;
			this.setDisponivel(true);
	}

	@Override
	public String toString() {
		String str = 
				"Carro: \nModelo: "+ this.getModelo() +
				"\nAno de fabricação: " + this.getAnoDeFabricacao() +
				"Preço: " +this.getPreco();
		if(this.isDisponivel()) {
			str+= "\n Proprietário: " + this.getProprietario().getNome();
		}
		return str;
	}	
	
}
