package empregados;

public class Programador extends Empregado {

    private float qtdeHoras;
    private float valorHora;

    Programador(){}

    Programador(String n, String m, float qH, float vH){
        super.setNome(n);
        super.setMatricula(m);
        this.qtdeHoras = qH;
        this.valorHora = vH;
    }  
    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float calculaSalario(){                
        return this.qtdeHoras * this.valorHora;
    }
}
