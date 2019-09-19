package datos;


import formulario.Campo;

public class Apellido extends DatoFormulario {

	public Apellido() {
		super(new Campo("Apellido"));
		
	}

	@Override
	public boolean validar() {
		return super.getValidador().getValidadorLetras().validarSoloLetras(super.getDato());
	}

}
