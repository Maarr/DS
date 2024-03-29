package main;

import java.io.IOException;

import elementos.Activar;
import elementos.GraficoBarras;
import elementos.GraficoCircular;
import elementos.LineaEstado;
import encuesta.Encuesta;
import encuesta.Pregunta;
import encuesta.TextUserInterface;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(new Pregunta("¿Está a favor de la energia nuclear?"));

		encuesta.añadirGrafico(new GraficoBarras());
		encuesta.añadirGrafico(new LineaEstado(encuesta));
		encuesta.añadirGrafico(new Activar(3, new GraficoCircular()));
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);

	}

}
