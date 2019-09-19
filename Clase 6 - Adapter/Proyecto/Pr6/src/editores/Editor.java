package editores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
public abstract class Editor {
	
	BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
	
	protected String getLínea() {
		do {
			try {
				return consola.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura. Inténtelo de nuevo.");
			}
		} while (true);
	}
	
	public void editar() {
		System.out.println("Editando "+getTipo()+".");
		System.out.println("Valores actuales:");
		imprimir();
		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		Hashtable<String,String> valores=getValoresEditables();
		for(String k:valores.keySet()) {
			System.out.print("- "+k+": ");
			String texto = getLínea();
			if (texto.length() > 0)
				valores.replace(k, texto);
		}
		editarValores(valores);
		System.out.println("Valores finales:");
		imprimir();
	}
	
	protected abstract void imprimir();
	protected abstract String getTipo();
	protected abstract Hashtable<String,String> getValoresEditables();
	protected abstract void editarValores(Hashtable<String,String> valores);

}
