package datos;

import formulario.Campo;

public class Ciudad extends DatoFormulario {
	
	public Ciudad() {
		super(new Campo("Ciudad"));
	}

	@Override
	public boolean validar() {
		String[] valores= {"Santander", "Oviedo", "C�diz"};
		return super.getValidador().getValidadorCumplirValores().validarCumpleValores(super.getDato(), valores);
	}
}