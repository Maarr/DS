package main;

import java.io.IOException;

import elementos.Activar;
import elementos.GraficoBarras;
import elementos.GraficoCircular;
import elementos.LineaEstado;
import elementos.Repetir;
import encuesta.Encuesta;
import encuesta.Pregunta;
import encuesta.TextUserInterface;

public class Main4 {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(new Pregunta("�Est� a favor de la energia nuclear?"));
		
		encuesta.a�adirGrafico(new LineaEstado(encuesta));
		encuesta.a�adirGrafico(new Activar(3, new GraficoCircular()));
		encuesta.a�adirGrafico(new Repetir(3,new GraficoBarras()));
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);

	}

}
