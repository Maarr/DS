package main;
import java.io.*;
import elementos.GraficoBarras;
import elementos.GraficoCircular;
import elementos.LineaEstado;
import encuesta.*;

public class Main1 {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(new Pregunta("¿Está a favor de la energia nuclear?"));
		
		encuesta.añadirGrafico(new GraficoBarras());
		encuesta.añadirGrafico(new GraficoCircular());
		encuesta.añadirGrafico(new LineaEstado(encuesta));
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}

