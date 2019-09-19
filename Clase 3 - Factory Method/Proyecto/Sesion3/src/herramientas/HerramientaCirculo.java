package herramientas;

import java.awt.Point;

import editor.Dibujo;
import figuras.Circulo;
import figuras.Figura;

public class HerramientaCirculo extends HerramientaCrear{
	
	public HerramientaCirculo(Dibujo dibujo) {
		super(dibujo);
	}

	private int px;
	private int py;
	private int sx;
	//private int sy;

	@Override
	public void pinchar(int x, int y) {
		px=x;
		py=y;		
	}

	@Override
	public void soltar(int x, int y) {
		sx=x;
		//sy=y;
		
	}

	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		//No hace nada
		
	}

	@Override
	public void crearFigura() {
		int radio=(sx-px)/2;
		Point centro=new Point(px+radio,py+radio);
		Figura fig= new Circulo(centro,radio);
		this.getDibujo().añadirFigura(fig);
	}

}
