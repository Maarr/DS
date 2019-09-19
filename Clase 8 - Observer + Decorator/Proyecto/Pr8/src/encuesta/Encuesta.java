package encuesta;

import java.util.ArrayList;
import java.util.List;

public class Encuesta {
	
	private List<ElementoGrafico> graficos=new ArrayList<ElementoGrafico>();
	private Pregunta pregunta;
	private int si;
	private int no;
	
	public Encuesta(Pregunta pregunta) {
		this.pregunta=pregunta;
	}
	
	public void añadirGrafico(ElementoGrafico graf) {
		graficos.add(graf);
	}
	
	public Pregunta getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		actualizar();
	}

	public void incrementaNo() {
		no++;
		actualizar();
	}
	
	public void actualizar() {
		for(ElementoGrafico elemento:graficos)
			elemento.actualizar();
		hacerBackup();
	}

	private void hacerBackup() {
		System.out.println("Aquí se guardarían los datos en disco/BD.");
	}

}
