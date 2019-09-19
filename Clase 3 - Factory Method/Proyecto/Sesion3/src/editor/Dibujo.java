package editor;

import java.util.*;

import figuras.Figura;

public class Dibujo {
	
	private ArrayList<Figura> figuras;
	
	public Dibujo() {
		figuras=new ArrayList<Figura>();
	}
	
	public void añadirFigura(Figura figura) {
		figuras.add(figura);
	}

	public void dibujar() {
		//Escribir el estado de las figuras q tiene
		for(int i=0; i<figuras.size();i++)
			System.out.println(figuras.get(i).dibujar());
	}
	
	public Figura figuraSeleccionada(int x,int y) {
		for(Figura fig:figuras) {
			if(fig.isSeleccionado(x, y))
				return fig;
		}
		return null;
	}

}
