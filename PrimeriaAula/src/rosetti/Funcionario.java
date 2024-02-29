package rosetti;

public class Funcionario {
	private String nome;
	private String sexo,estadoCivil;
	private int idade;
	private double salario;
	
	
	
	public Funcionario(String nome, String sexo, String estadoCivil, int idade, double salario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.idade = idade;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}	
	public String getSexo() {
		return sexo;
	}	
	public String getEstadoCivil() {
		return estadoCivil;
	}	
	public int getIdade() {
		return idade;
	}	
	public double getSalario() {
		return salario;
	}	
	
	public String verificarDados() {
		String mensagemSaida = "";
		if(this.nome.length() < 3) {
			mensagemSaida += "Nome menor que 3 caracteres";
		}
		
		if(this.idade > 150 || this.idade < 0) {
			mensagemSaida += "\n Idade inválida";
		}
		
		if(this.salario < 0) {
			mensagemSaida += "\n Salário menor que 0";
		}
		
		if(this.sexo.equals("f") || this.sexo.equals("m")) {			
		}
		else {
			mensagemSaida += "\n Sexo diferente de f ou m";
		}
		
		if(this.estadoCivil.equals("c") || this.estadoCivil.equals("s") || this.estadoCivil.equals("v") || this.estadoCivil.equals("d")) {
			
		}else {
			mensagemSaida += "\n Estado civil fora de c, s, v ou d";
		}
		
		
		return mensagemSaida;
	}

}
