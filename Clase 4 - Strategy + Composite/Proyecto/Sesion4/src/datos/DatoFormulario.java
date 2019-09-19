package datos;

import formulario.Campo;
import validadores.Validador;

public abstract class DatoFormulario {
	
	private Campo campo;
	private Validador validador=new Validador();
	
	public DatoFormulario(Campo campo) {
		this.campo=campo;
	}
	
	public void pideDato() {
		do {
			campo.pideDato();
		}while(!validar());
	}
	
	public String getDato() {
		return campo.getDato();
	}
	
	public Validador getValidador() {
		return validador;
	}
	
	public abstract boolean validar();
	
}
