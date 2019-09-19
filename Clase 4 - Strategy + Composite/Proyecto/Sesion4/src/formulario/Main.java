package formulario;
import datos.Apellido;
import datos.Ciudad;
import datos.Nombre;
import datos.Telefono;


public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addDato(new Nombre());
		formulario.addDato(new Apellido());
		formulario.addDato(new Telefono());
		formulario.addDato(new Ciudad());
		formulario.pideDatos();
	}
}