package PrimeiraAulaPOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baralho {	
	private List<String> cartasPorNaipe = Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","Q","K");
	private List<String> naipes = Arrays.asList("Copas","Ouros","Paus","Espadas");	
	private List<Carta> deck = new ArrayList<>();
	
	Baralho(){
		for(int i = 0; i < cartasPorNaipe.size(); i++) {
			
			for(int j = 0; j <naipes.size();j++ ) {
				Carta novaCarta = new Carta(cartasPorNaipe.get(i), naipes.get(j).toString());
				deck.add(novaCarta);
			}
		}
	}

	@Override
	public String toString() {
		String stringFinal = "Baralho [\n";
		for(Carta carta: deck) {
			stringFinal += carta.getNumero() + " - " + carta.getNaipe() +"\n";
			
		}
		stringFinal += "]";
		return stringFinal;
	}	
	
	public void embaralhar() {
		Collections.shuffle(deck);
	}
	
}
