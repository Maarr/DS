package formulario;

import editores.EditorFoto;
import editores.EditorMonumento;
import editores.EditorRestaurante;
import google.maps.*;
import model.*;

public class Main {

	public static void main(String[] args) {

		Monumento monumento = new Monumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");
		Restaurante restaurante = new Restaurante("Mario", "Via della Dataria . Roma", "555 123 457");
		Foto foto = new Foto("Un perro mordiendo a un turista", "Ra�l", new Coordenadas(40, 40));
		
		MiniFormulario formulario = new MiniFormulario();
		formulario.editar(new EditorMonumento(monumento));
		
		// Tarea 1. Editar tambi�n restaurante. Que se puedan editar el nombre y la direcci�n del mismo.
		formulario.editar(new EditorRestaurante(restaurante));
		
		// Tarea 2. Editar tambi�n foto. Que se puedan editar el usuario y la descripci�n de la misma.
		formulario.editar(new EditorFoto(foto));
	}

}