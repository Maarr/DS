package formulario;
import java.util.*;

import datos.DatoFormulario;

public class Formulario {
	
	private List<DatoFormulario> datos = new ArrayList<DatoFormulario>();
	
	public void addDato(DatoFormulario dato) {
		datos.add(dato);
	}

	public void pideDatos() {
		for (DatoFormulario dato : datos) {
			dato.pideDato();
			System.out.println(dato.getDato());
		}
	}

	
}
