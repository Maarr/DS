package elementos;

import encuesta.ElementoGrafico;

public class Activar implements ElementoGrafico{
	
	private int i;
	private ElementoGrafico elemento;
	
	public Activar(int i,ElementoGrafico elemento) {
		this.i=i;
		this.elemento=elemento;
	}

	@Override
	public void actualizar() {
		if(i==1) {
			elemento.actualizar();
		}else {
			i--;
		}
		
	}

}
