package formulario;
import java.io.*;

public class Campo {

	private String etiqueta;
	private String texto;

	public Campo(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print(etiqueta + ": ");
			texto = consola.readLine();

		} catch (IOException ex) {
			System.out.println(ex);
		}
		
	}
	
	public String getDato() {
		return texto;
	}


}
