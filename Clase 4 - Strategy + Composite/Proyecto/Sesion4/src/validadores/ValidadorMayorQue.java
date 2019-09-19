package validadores;

public class ValidadorMayorQue {
	
	public boolean validarMayorQue(String cadena, int tope) {
		if(Integer.parseInt(cadena)>tope)
			return true;
		else
			return false;
	}

}
