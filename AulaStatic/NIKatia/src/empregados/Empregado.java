package empregados;

public abstract class Empregado {
    private String nome;
    private String matricula;

    Empregado(){};

    Empregado(String n, String m){
        this.nome = n;
        this.matricula = m;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract float calculaSalario();
}
