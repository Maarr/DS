package main;

import java.io.*;

import editor.*;
import herramientas.*;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	public void run() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		Editor editor = new Editor(new Dibujo());

		System.out.println("Comandos Herramientas: cuadrado, circulo, triangulo, seleccion");
		System.out.println("Comandos Rat�n: pinchar x,y / mover x,y / soltar x,y");
		System.out.println("Otros Comandos: dibujar, exit");

		do {
			System.out.print(">");
			String[] line = in.readLine().split("[ ,]");

			if (line[0].equals("exit"))
				return;
			if (line[0].equals("cuadrado")) {
				HerramientaCrear herr=new HerramientaCuadrado(editor.getDibujo());
				editor.setHerramientaActiva(herr);
				editor.setHerramientaCrear(herr); //	editor.xxx
			}
			else if (line[0].equals("circulo")){			
				HerramientaCrear herr=new HerramientaCirculo(editor.getDibujo());
				editor.setHerramientaActiva(herr);
				editor.setHerramientaCrear(herr); //	editor.xxx
			}
			else if (line[0].equals("triangulo")){
				HerramientaCrear herr=new HerramientaTriangulo(editor.getDibujo());
				editor.setHerramientaActiva(herr);
				editor.setHerramientaCrear(herr); //	editor.xxx
			}
			else if (line[0].equals("seleccion"))
				editor.setHerramientaActiva(new HerramientaSeleccion(editor.getDibujo())); //	editor.xxx
			
			else if (line[0].equals("pinchar")) {
				int x = Integer.parseInt(line[1]);
				int y = Integer.parseInt(line[2]);
				editor.getHerramientaActiva().pinchar(x, y);//	editor.xxx
			} else if (line[0].equals("mover")) {
				int x = Integer.parseInt(line[1]);
				int y = Integer.parseInt(line[2]);
				editor.getHerramientaActiva().mover(x, y);//	editor.xxx
			} else if (line[0].equals("soltar")) {
				int x = Integer.parseInt(line[1]);
				int y = Integer.parseInt(line[2]);
				editor.getHerramientaActiva().soltar(x, y);//	editor.xxx
			} else if (line[0].equals("dibujar"))
				editor.dibujar();
			else
				System.out.println("Comando no v�lido");

		} while (true);
	}

	private BufferedReader in;

}
