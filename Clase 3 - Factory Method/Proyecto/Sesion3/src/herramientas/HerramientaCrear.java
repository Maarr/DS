package herramientas;

import editor.Dibujo;

public abstract class HerramientaCrear implements Herramienta {
	
	private Dibujo dibujo;
	
	public HerramientaCrear(Dibujo  dibujo) {
		this.dibujo=dibujo;
	}
	
	public Dibujo getDibujo() {
		return dibujo;
	}
	public abstract void crearFigura();
	

}
