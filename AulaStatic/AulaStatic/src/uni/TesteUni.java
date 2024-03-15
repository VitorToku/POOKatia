package uni;

public class TesteUni {

	public static void main(String[] args) {
		Universidade uni = new Universidade("FECAP");
		
		uni.adicionarEstudante(new Estudante("Vitor", 23024862));
		uni.adicionarEstudante(new Estudante("Alek", 20154862));
		uni.adicionarEstudante(new Estudante("João", 2098457));
		System.out.println(uni.toString());
	}

}
