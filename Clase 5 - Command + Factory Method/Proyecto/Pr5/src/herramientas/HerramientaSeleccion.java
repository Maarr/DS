package herramientas;

import java.awt.Point;
import cambios.CambioMover;
import editor.*;


public class HerramientaSeleccion implements Herramienta {

	public HerramientaSeleccion(Editor editor) {
		this.editor = editor;
	}

	public void pinchar(int x, int y) {
		seleccionada = editor.getDibujo().getFigura(x, y);
		posicionAnterior=new Point(x,y);
		movimiento=posicionAnterior;
	}

	public void mover(int x, int y) {
		mueveIncremento(x, y);
	}

	public void soltar(int x, int y) {
		mueveIncremento(x, y);
		int dx=posicionAnterior.x-movimiento.x;
		int dy=posicionAnterior.y-movimiento.y;
		editor.getHistorial().a�adirCambio(new CambioMover(dx,dy,seleccionada));
	}

	private void mueveIncremento(int x, int y) {
		if (seleccionada != null) {
			seleccionada.mover(x - posicionAnterior.x, y - posicionAnterior.y);
			posicionAnterior = new Point(x, y);
		}
	}

	private Editor editor;
	private Figura seleccionada;
	
	private Point posicionAnterior;
	private Point movimiento;
}