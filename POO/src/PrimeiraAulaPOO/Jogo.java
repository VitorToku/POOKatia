package PrimeiraAulaPOO;

public class Jogo {

	public static void main(String[] args) {
		
		Boolean continuar = true;
		BaralhoPilha baralho = new BaralhoPilha();
		
		
		Jogador ze = new Jogador("Zé");		
		Jogador casa = new Jogador("Casa");
		
		baralho.embaralhar();
		System.out.println(baralho);		
		
		ze.puxarCartas(baralho, 2);		
		casa.puxarCartas(baralho, 2);
		
		System.out.println(ze);
		System.out.println(casa);
		
		while(continuar) {
			System.out.println("Deseja continuar?(s ou n)");
			
		}		
		
	}	

}
