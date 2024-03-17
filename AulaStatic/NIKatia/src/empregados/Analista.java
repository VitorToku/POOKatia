package empregados;

public class Analista extends Empregado {

    private float[] valorPorProjeto;

    Analista(){};
    Analista(String n, String m, float[] vP){
        super.setNome(n);
        super.setMatricula(m);
        this.valorPorProjeto = vP;
    }

    public float[] getValorProProjeto() {
        return valorPorProjeto;
    }
    public void setValorProProjeto(float[] valorProProjeto) {
        this.valorPorProjeto = valorProProjeto;
    }

    public float calculaSalario(){
        float somaValores = 0;
        for(float valor: valorPorProjeto){
            somaValores += valor;
        }

        return somaValores;
    }
   
}
