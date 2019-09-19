package datos;

import formulario.Campo;

public class Telefono extends DatoFormulario{
	
	public Telefono() {
		super(new Campo("Telefono"));
	}

	@Override
	public boolean validar() {
		return super.getValidador().getValidadorDigitos().validarSoloDigitos(super.getDato());
	}

}
