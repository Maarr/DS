package validadores;

public class ValidadorLetras {
	
	public boolean validarSoloLetras(String cadena) {
		boolean valido=true;
		for (char ch : cadena.toCharArray()) {
			if (!Character.isLetter(ch)) {
				valido = false;
				break;
			}
		}
		return valido;
	}
	

}
