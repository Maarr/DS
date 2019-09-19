package datos;

import formulario.Campo;
import validadores.Validador;

public class Edad extends DatoFormulario{
	
	public Edad() {
		super(new Campo("Edad"));
	}

	@Override
	public boolean validar() {
		Validador v=super.getValidador();
		return (v.getValidadorDigitos().validarSoloDigitos(super.getDato()) && v.getValidadorMayorQue().validarMayorQue(super.getDato(), 18));
	}

}