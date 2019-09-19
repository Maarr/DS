package herramientas;

import java.awt.Point;

import editor.Dibujo;
import figuras.Cuadrado;
import figuras.Figura;

public class HerramientaCuadrado extends HerramientaCrear {
	
	public HerramientaCuadrado(Dibujo dibujo) {
		super(dibujo);
	}

	private int px;
	private int py;
	private int sx;
	private int sy;

	@Override
	public void pinchar(int x, int y) {
		px=x;
		py=y;
	}

	@Override
	public void soltar(int x, int y) {
		sx=x;
		sy=y;
	}

	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		
		//Creo que no hace nada en el caso de tener la Heeramienta Cuadrado activada
		
	}
	
	@Override
	public void crearFigura() {
		Figura fig= new Cuadrado(new Point(px,py),sx-px,sy-py);
		this.getDibujo().añadirFigura(fig);
	}

}
