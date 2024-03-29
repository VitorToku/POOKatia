package veiculos;

public abstract class Veiculo implements IVendas {
	private String modelo;
	private int anoDeFabricacao;
	private double preco;
	private boolean disponivel;
	private Pessoa proprietario;

	// Implementação do método vender da interface IVendas

	@Override
	public void vender(Pessoa comprador){		
		this.disponivel = false;
		this.proprietario = comprador;
	}

	//Getters e Setters
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public double getPreco() {
		return preco;
	}		
	
}
