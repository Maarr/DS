package editores;

import java.util.Hashtable;

import model.Foto;

public class EditorFoto extends Editor{
	
	private Foto foto;
	
	public EditorFoto(Foto foto) {
		this.foto=foto;
	}

	@Override
	protected void imprimir() {
		System.out.println("- Usuario = " + foto.getUsuario());
		System.out.println("- Descripci�n = " + foto.getDescripci�n());
		
	}

	@Override
	protected String getTipo() {
		return "Foto";
	}

	@Override
	protected Hashtable<String, String> getValoresEditables() {
		Hashtable<String,String> valores=new Hashtable<String,String>();
		valores.put("Usuario", "");
		valores.put("Descripci�n", "");
		return valores;
	}

	@Override
	protected void editarValores(Hashtable<String, String> valores) {
		foto.setUsuario(valores.get("Usuario"));
		foto.setDescripci�n(valores.get("Descripci�n"));
		
	}

}
