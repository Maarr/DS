package editores;

import java.util.Hashtable;

import model.Restaurante;

public class EditorRestaurante extends Editor {
	
	private Restaurante restaurante;
	
	public EditorRestaurante(Restaurante restaurante) {
		this.restaurante=restaurante;
	}

	@Override
	protected void imprimir() {
		System.out.println("- Nombre = " + restaurante.getNombre());
		System.out.println("- Direcci�n = " + restaurante.getDirecci�n());
		
	}

	@Override
	protected String getTipo() {
		return "Restaurante";
	}

	@Override
	protected Hashtable<String, String> getValoresEditables() {
		Hashtable<String,String> valores=new Hashtable<String,String>();
		valores.put("Nombre", "");
		valores.put("Direcci�n", "");
		return valores;
	}

	@Override
	protected void editarValores(Hashtable<String, String> valores) {
		restaurante.setNombre(valores.get("Nombre"));
		restaurante.setDirecci�n(valores.get("Direcci�n"));
		
	}

}
