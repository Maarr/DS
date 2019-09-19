package datos;

import formulario.Campo;

public class Ubicacion extends DatoFormulario{
	
	public Ubicacion() {
		super(new Campo("Ubicaci�n"));
	}

	@Override
	public boolean validar() {
		String[] valores= {"Santander", "Oviedo", "C�diz"};
		return ((super.getValidador().getValidadorLongitud().validarLongitud(super.getDato(), 5) &&
				super.getValidador().getValidadorDigitos().validarSoloDigitos(super.getDato())) ||
				(super.getValidador().getValidadorCumplirValores().validarCumpleValores(super.getDato(), valores)));
	}

}
