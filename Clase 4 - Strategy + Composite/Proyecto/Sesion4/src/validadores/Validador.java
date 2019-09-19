package validadores;

public class Validador {
	
	private ValidadorLetras letras;
	private ValidadorDigitos digitos;
	private ValidadorLongitud longitud;
	private ValidadorMayorQue mayorQue;
	private ValidadorMenorQue menorQue;
	private ValidadorCumplirValores cumplirValores;
	
	public Validador() {
		crearValidadores();
	}
	
	private void crearValidadores() {
		letras=new ValidadorLetras();
		digitos=new ValidadorDigitos();
		longitud=new ValidadorLongitud();
		mayorQue=new ValidadorMayorQue();
		menorQue=new ValidadorMenorQue();
		cumplirValores=new ValidadorCumplirValores();
	}
	
	public ValidadorLetras getValidadorLetras() {
		return letras;
	}

	public ValidadorDigitos getValidadorDigitos() {
		return digitos;
	}

	public ValidadorLongitud getValidadorLongitud() {
		return longitud;
	}

	public ValidadorMayorQue getValidadorMayorQue() {
		return mayorQue;
	}

	public ValidadorMenorQue getValidadorMenorQue() {
		return menorQue;
	}

	public ValidadorCumplirValores getValidadorCumplirValores() {
		return cumplirValores;
	}
	
	
	
	
	
	
	
	

	
	

	
	
	

}
