package datos;

import formulario.Campo;

public class Nombre extends DatoFormulario{

	public Nombre() {
		super(new Campo("Nombre"));
	}

	@Override
	public boolean validar() {
		return super.getValidador().getValidadorLetras().validarSoloLetras(super.getDato());
	}

}
