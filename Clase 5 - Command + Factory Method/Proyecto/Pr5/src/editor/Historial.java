package editor;

import java.util.Stack;

import cambios.Cambio;

public class Historial {
	
	private Stack<Cambio> pushes;
	private Stack<Cambio> pops;
	
	public Historial() {
		pushes=new Stack<Cambio>();
		pops=new Stack<Cambio>();
	}
	
	public void undo() {
		if(pushes.isEmpty()) {
			System.out.println("No es posible hacer undo");
		}else {
			Cambio aux=pushes.pop();
			pops.push(aux);
			aux.undo();
		}
		
	}
	public  void redo() {
		if(pops.isEmpty()) {
			System.out.println("No es posible hacer redo");
		}else {
			Cambio aux=pops.pop();
			pushes.push(aux);
			aux.redo();
		}
	}
	
	public void a�adirCambio(Cambio cambio) {
		pushes.push(cambio);
		pops.clear();
	}

}