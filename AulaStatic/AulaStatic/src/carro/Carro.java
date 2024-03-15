package carro;

public class Carro {
	private String modelo;
	private Motor motor;
	public Carro(String modelo, int cilindradas) {
		
		this.modelo = modelo;
		this.motor = new Motor(cilindradas);
	}
	public String getModelo() {
		return modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	@Override
	public String toString() {
		return "Carro [modelo= " + modelo + ", \nCilindradas do motor= " + motor.getCilindradas() + "]";
	}
	
	
}
