package editores;

import java.util.Hashtable;

import model.Monumento;

public class EditorMonumento extends Editor {
	
	private Monumento monumento;
	
	public EditorMonumento(Monumento monumento) {
		this.monumento=monumento;
	}

	@Override
	public void editarValores(Hashtable<String,String> valores) {
			monumento.setAutor(valores.get("Autor"));
			monumento.setDirección(valores.get("Dirección"));
	}

	@Override
	protected void imprimir() {
		System.out.println("- Autor = " + monumento.getAutor());
		System.out.println("- Dirección = " + monumento.getDirección());
		
	}

	@Override
	protected Hashtable<String, String> getValoresEditables() {
		Hashtable<String,String> valores=new Hashtable<String,String>();
		valores.put("Autor", "");
		valores.put("Dirección", "");
		return valores;
	}

	@Override
	protected String getTipo() {
		return "Monumento";
	}

}
