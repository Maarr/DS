package herramientas;

import java.awt.Point;

import editor.Dibujo;
import figuras.Figura;
import figuras.Triangulo;

public class HerramientaTriangulo extends HerramientaCrear {
	
	public HerramientaTriangulo(Dibujo dibujo) {
		super(dibujo);
	}

	private Point v1;
	private Point v2;
	private Point v3;

	@Override
	public void pinchar(int x, int y) {
		if(v1==null) {
			v1=new Point(x,y);
			return;
		}else if(v1!=null && v2==null) {
			v2=new Point(x,y);
			return;
		}else {
			v3=new Point(x,y);
			return;
		}
		
	}

	@Override
	public void soltar(int x, int y) {
		// TODO Auto-generated method stub
		//No hace nada en este caso
		
	}

	@Override
	public void mover(int x, int y) {
		// TODO Auto-generated method stub
		//No hace nada en este caso
		
	}
	
	@Override
	public void crearFigura() {
		Figura fig= new Triangulo(v1,v2,v3);
		v1=null;
		v2=null;
		v3=null;
		this.getDibujo().añadirFigura(fig);
	}

}
