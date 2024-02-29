package PrimeiraAulaPOO;

public class Carta {
	private String numero;	
	private String naipe;
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getNaipe() {
		return this.naipe;
	}
	
	public Carta(String numero , String naipe){
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public int valorNo21() {
		int valor = 0;
		if(this.numero.equals("A") || this.numero.equals("J") ||this.numero.equals("Q") || this.numero.equals("K")) {
			switch(this.numero) {
			case "A":
				valor = 1;
				break;
			case "J":
				valor = 10;
				break;
			case "Q":
				valor = 10;
				break;
			case "K":
				valor = 10;
				break;
			}
		}else {
			valor = Integer.valueOf(this.numero);
		}
		return valor;
	}
	@Override
	public String toString() {
		return numero + " - " + naipe;
	}
}
