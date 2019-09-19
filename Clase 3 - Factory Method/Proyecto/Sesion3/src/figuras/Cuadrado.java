package figuras;

import java.awt.Point;

public class Cuadrado implements Figura {
	
	private Point esquina;
	private int ancho;
	private int alto;

	public Cuadrado(Point esquina, int ancho, int alto) {
		this.esquina=esquina;
		this.ancho=ancho;
		this.alto=alto;
	}

	@Override
	public String dibujar() {
		return "Cuadrado: x= "+esquina.getX() + ", y= "+ esquina.getY()+", ancho= "+ancho+", alto= "+alto;
	}


	@Override
	public boolean isSeleccionado(int x, int y) {
		return (esquina.x <= x && x <= esquina.x + ancho) && (esquina.y <= y && y <= esquina.y + alto);
	}

	@Override
	public void mover(int x, int y) {
		this.esquina.x=esquina.x+x;
		this.esquina.y=esquina.y+y;
		
	}
	

	
	
	

}