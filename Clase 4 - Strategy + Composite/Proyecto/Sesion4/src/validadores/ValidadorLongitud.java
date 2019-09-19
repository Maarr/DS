package validadores;

public class ValidadorLongitud {
	
	public boolean validarLongitud(String cadena, int tope) {
		if(cadena.length()==tope)
			return true;
		else
			return false;
	}

}
