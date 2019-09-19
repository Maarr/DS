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
			monumento.setDirecci�n(valores.get("Direcci�n"));
	}

	@Override
	protected void imprimir() {
		System.out.println("- Autor = " + monumento.getAutor());
		System.out.println("- Direcci�n = " + monumento.getDirecci�n());
		
	}

	@Override
	protected Hashtable<String, String> getValoresEditables() {
		Hashtable<String,String> valores=new Hashtable<String,String>();
		valores.put("Autor", "");
		valores.put("Direcci�n", "");
		return valores;
	}

	@Override
	protected String getTipo() {
		return "Monumento";
	}

}
