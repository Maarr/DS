package figuras;

import java.awt.Point;

public class Triangulo implements Figura {
	
	private Point v1;
	private Point v2;
	private Point v3;
	
	public Triangulo(Point v1, Point v2, Point v3) {
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}

	@Override
	public String dibujar() {
		return "Triangulo: v1= "+v1.toString() + "v2= "+ v2.toString()+", v3= "+v3.toString();
	}

	@Override
	public boolean isSeleccionado(int x, int y) {
		Point posicion = new Point(x,y);
		return posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3);
	}

	@Override
	public void mover(int x, int y) {
		v1.translate(x, y);
	    v2.translate(x, y);
	    v3.translate(x, y);
		
	}

}
