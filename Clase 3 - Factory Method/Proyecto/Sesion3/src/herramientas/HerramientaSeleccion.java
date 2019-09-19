package herramientas;

import editor.Dibujo;
import figuras.Figura;

public class HerramientaSeleccion implements Herramienta{
	
	private Dibujo dibujo;
	
	private int x;
	private int y;
	
	private Figura fig;
	
	
	public HerramientaSeleccion(Dibujo dibujo) {
		this.dibujo=dibujo;
	}
	

	@Override
	public void pinchar(int x, int y) {
		fig=dibujo.figuraSeleccionada(x, y);
		if(fig!=null) {
			this.x=x;
			this.y=y;
		}
		
	}

	@Override
	public void soltar(int x, int y) {
		if(fig!=null) {
			fig.mover(x-this.x, y-this.y);
			this.x=x;
			this.y=y;
		}
		
	}

	@Override
	public void mover(int x, int y) {
		if(fig!=null) {
			fig.mover(x-this.x, y-this.y);
			this.x=x;
			this.y=y;
		}
		
	}

}
