package main;
import java.io.*;
import elementos.GraficoBarras;
import elementos.GraficoCircular;
import elementos.LineaEstado;
import encuesta.*;

public class Main1 {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta(new Pregunta("�Est� a favor de la energia nuclear?"));
		
		encuesta.a�adirGrafico(new GraficoBarras());
		encuesta.a�adirGrafico(new GraficoCircular());
		encuesta.a�adirGrafico(new LineaEstado(encuesta));
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}

