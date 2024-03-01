package PrimeiraAulaPOO;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean continuar = true;
		String resposta;
		BaralhoPilha baralho = new BaralhoPilha();
		
		
		Jogador ze = new Jogador("Zé");		
		Jogador casa = new Jogador("Casa");
		
		baralho.embaralhar();
		System.out.println(baralho);		
		
		ze.puxarCartas(baralho, 2);		
		casa.puxarCartas(baralho, 2);	
		
		do {
			System.out.println("Mão da casa: " + casa.somaMao());
			System.out.println("Sua mão: " + ze.somaMao());
			
			System.out.println("Deseja puxar mais uma? (s ou n)");
			resposta = scan.nextLine();
			switch (resposta) {
			case "s":
				ze.puxarCarta(baralho);
				break;
			case "n":
				continuar = false;
				continue;				
			default:
				System.out.println("digite s ou n");
			}
			
			if(distanciaDe21(casa) > 1) {
				casa.puxarCarta(baralho);
			}
			
			
		}while(continuar);
		
		comprarAteOndeDer(casa, baralho);		
		
		if(distanciaDe21(ze) >= 0 && distanciaDe21(ze) < distanciaDe21(casa) ) {
			System.out.println("Jogador ganhou com a mão: " + ze.toString());
		}else if(distanciaDe21(ze) >= 0 && distanciaDe21(casa) < 0) {
			System.out.println("Jogador ganhou com a mão: " + ze.toString());
		}else if(distanciaDe21(ze) < 0 && distanciaDe21(casa) < 0) {
			System.out.println("Ninguém ganhou:\n " + ze.toString() + "\n" + casa.toString());
		}else if(distanciaDe21(ze) == distanciaDe21(casa)) {
			System.out.println("Ninguém ganhou:\n " + ze.toString() + "\n" + casa.toString());
		}else {
			System.out.println("A casa ganhou com a mão:\n " + casa.toString());
		}
		
	}	
	
	static int distanciaDe21(Jogador jogador) {
		int distancia;
		distancia = 21 - jogador.somaMao();
		return distancia;
	}
	
	static void comprarAteOndeDer(Jogador jogador, BaralhoPilha baralho) {
		for(int i=0; i<21;i++) {
			if( distanciaDe21(jogador) > 1) {
				jogador.puxarCarta(baralho);
			}
		}		
	}

}
