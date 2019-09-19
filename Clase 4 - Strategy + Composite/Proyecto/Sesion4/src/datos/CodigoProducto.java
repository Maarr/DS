package datos;

import formulario.Campo;

public class CodigoProducto extends DatoFormulario{
	
	public CodigoProducto() {
		super(new Campo("C�digo de Producto"));
	}

	@Override
	public boolean validar() {
		return super.getValidador().getValidadorLongitud().validarLongitud(super.getDato(), 4);
	}

}
