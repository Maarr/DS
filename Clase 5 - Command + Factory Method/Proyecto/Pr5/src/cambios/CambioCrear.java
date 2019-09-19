package cambios;

import editor.Dibujo;
import editor.Figura;

public class CambioCrear implements Cambio {
	
	private Figura figura;
	private Dibujo dibujo;
	
	public CambioCrear(Figura figura, Dibujo dibujo) {
		this.figura=figura;
		this.dibujo=dibujo;
	}

	@Override
	public void undo() {
		dibujo.DeleteFigura(figura);
		
	}

	@Override
	public void redo() {
		dibujo.AddFigura(figura);
	}

}