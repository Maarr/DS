package elementos;

import encuesta.ElementoGrafico;

public class Repetir implements ElementoGrafico{
	
	private int freq;
	private int cont;
	private ElementoGrafico elemento;
	
	public Repetir(int freq,ElementoGrafico elemento) {
		this.freq=freq;
		this.cont=freq;
		this.elemento=elemento;
	}

	@Override
	public void actualizar() {
		if(freq==cont) {
			elemento.actualizar();
			cont=1;
		}else {
			cont++;
		}
		
	}

}
