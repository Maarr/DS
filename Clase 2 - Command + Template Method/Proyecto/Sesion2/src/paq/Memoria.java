package paq;

public class Memoria {
	
	private int[] memoria = new int[1024];
	
	public int getValor(int direccion) {
		return memoria[direccion];
	}
	
	public void setValor(int valor, int direccion) {
		memoria[direccion]=valor;
	}

}
