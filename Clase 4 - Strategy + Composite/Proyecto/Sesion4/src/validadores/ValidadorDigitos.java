package validadores;

public class ValidadorDigitos {
	

	public boolean validarSoloDigitos(String cadena) {
		boolean valido=true;
		for (char ch : cadena.toCharArray()) {
			if (!Character.isDigit(ch)) {
				valido = false;
				break;
			}
		}
		return valido;
	}

}
