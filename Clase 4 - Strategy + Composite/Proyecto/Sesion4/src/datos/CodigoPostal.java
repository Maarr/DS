package datos;

import formulario.Campo;

public class CodigoPostal extends DatoFormulario {
	
	public CodigoPostal() {
		super(new Campo("Código Postal"));
	}

	@Override
	public boolean validar() {
		return (super.getValidador().getValidadorLongitud().validarLongitud(super.getDato(), 5) && super.getValidador().getValidadorDigitos().validarSoloDigitos(super.getDato()));
	}

}
