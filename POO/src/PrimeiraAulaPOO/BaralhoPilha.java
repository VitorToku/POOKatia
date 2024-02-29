package PrimeiraAulaPOO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BaralhoPilha {
	private List<String> cartasPorNaipe = Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K");
	private List<String> naipes = Arrays.asList("Copas","Ouros","Paus","Espadas");	
	private Stack<Carta> deck = new Stack<>();
	
	BaralhoPilha(){
		for(int i = 0; i < cartasPorNaipe.size(); i++) {
			
			for(int j = 0; j <naipes.size();j++ ) {
				Carta novaCarta = new Carta(cartasPorNaipe.get(i), naipes.get(j).toString());
				deck.push(novaCarta);
			}
		}
	}
	
	public Carta puxar() {		
		return deck.pop();
	}
	
	public void embaralhar() {
		Collections.shuffle(deck);
	}
	
	public String toString() {
		String stringFinal = "Baralho por pilha \n[\n";
		for(Carta carta: deck) {
			stringFinal += carta.getNumero() + " - " + carta.getNaipe() +"\n";
			
		}
		stringFinal += "]\n";
		return stringFinal;
	}	

	
}
