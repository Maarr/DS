package datos;

import formulario.Campo;

public class Sueldo extends DatoFormulario {
	
	public Sueldo() {
		super(new Campo("Sueldo"));
	}

	@Override
	public boolean validar() {
		return (super.getValidador().getValidadorDigitos().validarSoloDigitos(super.getDato()) &&
				super.getValidador().getValidadorMayorQue().validarMayorQue(super.getDato(), 800) &&
				super.getValidador().getValidadorMenorQue().validarMenorQue(super.getDato(), 1200));
	}

}
