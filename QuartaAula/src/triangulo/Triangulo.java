package triangulo;

public class Triangulo {
	float base, altura;
	
	Triangulo(){	
	}
	
	Triangulo(float b, float a){
		this.altura = a;
		this.base = b;
	}
	
	float calculaArea() {
		return base*altura/2;
	}
	
	void imprimeDados() {
		System.out.printf("Base: " + this.base +
							"\nAltura: " + this.altura +
							"\nÁrea: %.3f", this.calculaArea());
	}
}
