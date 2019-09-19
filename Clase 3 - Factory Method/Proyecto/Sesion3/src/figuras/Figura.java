package figuras;

public interface Figura {
	
	String dibujar();	
	boolean isSeleccionado(int x, int y);
	void mover(int x,int y);
	

}
