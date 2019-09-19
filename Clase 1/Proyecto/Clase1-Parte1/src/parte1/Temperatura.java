package parte1;

public class Temperatura {
	
	private double valorCelsius;
	private double valorFahrenheit;
	
	public Temperatura(double valor) {
		setCelsius(valor);
		this.valorFahrenheit=valor* 1.8 + 32;
	}
	
	public double getCelsius() {
		return valorCelsius;
	}
	
	public double getFahrenheit() {
		return valorFahrenheit;
	}

	public void setCelsius(double valor) {
		this.valorCelsius = valor;
	}
	
	public void setFahrenheit(double valor) {
		this.valorFahrenheit = valor;
	}
	
	
	

}
