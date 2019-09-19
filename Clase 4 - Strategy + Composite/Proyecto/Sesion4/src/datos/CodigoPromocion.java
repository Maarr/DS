package datos;

import formulario.Campo;

public class CodigoPromocion extends DatoFormulario {
	
	public CodigoPromocion() {
		super(new Campo("C�digo de Promoci�n"));
	}

	@Override
	public boolean validar() {
		return (super.getValidador().getValidadorLetras().validarSoloLetras(super.getDato()) || 
				(super.getValidador().getValidadorDigitos().validarSoloDigitos(super.getDato()) && super.getValidador().getValidadorLongitud().validarLongitud(super.getDato(), 3)));
	}

}
