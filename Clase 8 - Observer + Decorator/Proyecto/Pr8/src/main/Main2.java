package main;

import java.io.IOException;
import elementos.GraficoCircular;
import elementos.LineaEstado;
import encuesta.Encuesta;
import encuesta.Pregunta;
import encuesta.TextUserInterface;

public class Main2 {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(new Pregunta("�Est� a favor de la energia nuclear?"));
		encuesta.a�adirGrafico(new GraficoCircular());
		encuesta.a�adirGrafico(new LineaEstado(encuesta));
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);

	}

}
