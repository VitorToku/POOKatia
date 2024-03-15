package uni;

import java.util.ArrayList;

public class Universidade {
	private String nome;
	private ArrayList<Estudante> listaEstudantes;
	
	public Universidade(String nome) {
		super();
		this.nome = nome;
		this.listaEstudantes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Estudante> getListaEstudantes() {
		return listaEstudantes;
	}
	
	public void adicionarEstudante(Estudante estudante) {
		listaEstudantes.add(estudante);
	}

	@Override
	public String toString() {
		String resultado = this.getNome() + ": \nEstudantes: ";
		
		for(Estudante estudante: listaEstudantes) {
			resultado = resultado + " " + estudante.getNome();
			
			if(listaEstudantes.indexOf(estudante) < listaEstudantes.size() - 1) {
				resultado+= ",";
			}
		}
		
		
		return resultado;
	}
	
	
}
