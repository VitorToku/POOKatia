package carro;

public class Carro {
	//atributos
	String marca;
	int ano;
	String modelo;
	float valorFipe;
	
	//irá iniciar dizendo que o modelo é desconhecido
	
	public Carro() {
		this.marca = "desconhecido";
	}
	
	public Carro(String marca, float valorFipe) {
		this.marca = marca;
		this.valorFipe = valorFipe;
	}
	
	 //imprimeDados():void
	void imprimeDados() {
		System.out.println("Dados do carro:\n Marca: " + marca+ 
				"\n modelo: " + modelo +
				"\n ano: " + ano +
				"\n valor Fipe: " + valorFipe );
	}
	
	//calcularValorVenda(v:float):float fipe mais 15%
	float calcularValorVenda(float v) {
		return v*1.15f;
	}
}
