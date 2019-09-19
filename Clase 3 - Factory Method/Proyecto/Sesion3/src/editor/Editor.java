package editor;

import herramientas.HerramientaSeleccion;
import herramientas.Herramienta;
import herramientas.HerramientaCrear;

public class Editor {
	
	private Dibujo dibujo;
	private Herramienta herramienta;
	private HerramientaCrear herramientaCrear;

	public Editor(Dibujo dibujo) {
		setDibujo(dibujo);
		setHerramientaActiva(new HerramientaSeleccion(getDibujo()));
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void dibujar() {
		if(herramienta.equals(herramientaCrear)) {
			herramientaCrear.crearFigura();
			setHerramientaActiva(new HerramientaSeleccion(getDibujo()));
		}
		dibujo.dibujar();
		
	}
	
	public Herramienta getHerramientaActiva() {
		return herramienta;
	}
	
	public void setHerramientaActiva(Herramienta herramienta) {
		this.herramienta=herramienta;
	}
	public void setHerramientaCrear(HerramientaCrear herramienta) {
		this.herramientaCrear=herramienta;
	}
}
