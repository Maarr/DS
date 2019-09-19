package validadores;

public class ValidadorCumplirValores {
	
	public boolean validarCumpleValores(String cadena, String[] valores) {
		boolean valido=false;
		for (String valor : valores) {
			if (cadena.toLowerCase().equals(valor.toLowerCase())) {
				valido = true;
				break;
			}
		}
		
		return valido;
	}

}
