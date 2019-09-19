package elementos;

import encuesta.ElementoGrafico;
import encuesta.Encuesta;

public class LineaEstado implements ElementoGrafico{
	
	private Encuesta encuesta;
	
	public LineaEstado(Encuesta encuesta) {
		this.encuesta=encuesta;
	}
	
	
	public void actualizar() {
		System.out.println("n� votos SI= "+encuesta.getVotosSi()+" n� votos NO= "+encuesta.getVotosNo());
	}

}