package validadores;

public class ValidadorMenorQue {
	
	public boolean validarMenorQue(String cadena, int tope) {
		if(Integer.parseInt(cadena)<tope)
			return true;
		else
			return false;
	}

}
