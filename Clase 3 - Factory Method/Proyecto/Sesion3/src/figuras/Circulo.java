package figuras;

import java.awt.Point;

public class Circulo implements Figura{
	
	private Point centro;
	private int radio;
	
	public Circulo(Point centro, int radio) {
		this.centro=centro;
		this.radio=radio;
	}

	@Override
	public String dibujar() {
		return "Circulo: centro= "+centro.toString() + " radio= "+ radio;
	}

	@Override
	public boolean isSeleccionado(int x,int y) {
		double distancia = Math.sqrt(Math.pow(x - centro.x, 2) + Math.pow(y - centro.y, 2));
		return distancia < radio;
	}

	@Override
	public void mover(int x, int y) {
		centro.translate(x, y);
		
	}

}
