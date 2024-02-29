package PrimeiraAulaPOO;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	private String nome;
	private List<Carta> mao = new ArrayList<>();	
	
	public List<Carta> getMao() {
		return mao;
	}
	
	public int somaMao() {
		int soma = 0;
		for(Carta carta: mao) {
			soma += carta.valorNo21();
		}
		return soma;
	}

	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void puxarCarta(BaralhoPilha deck) {
		mao.add(deck.puxar());
	}
	
	public void puxarCartas(BaralhoPilha deck, int numeroDeCartas) {		
		for(int i = 0; i<numeroDeCartas;i++) {
			puxarCarta(deck);
		}
	}

	@Override
	public String toString() {
		String stringFinal = "Jogador: " + this.nome + "\nMão \n[";
		for(Carta carta : mao) {
			stringFinal += "\n" + carta;
		}
		stringFinal += "\n]\n" + "Soma: " + this.somaMao() +"\n";
		
		return stringFinal;
	}
	
	
}
