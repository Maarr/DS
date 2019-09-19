package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Monumento;

public class MarcadorMonumento implements Marcador{
	
	private Monumento monumento;
	private Navegador nav=new Navegador();

	public MarcadorMonumento(Monumento monumento) {
		this.monumento=monumento;
	}
	
	@Override
	public Coordenadas getCoordenadas() {
		return nav.getCoordenadas(monumento.getDirecci�n());
	}

	@Override
	public String getTooltipInfo() {
		return monumento.getNombre()+" "+monumento.getAutor();
	}

	@Override
	public void abrir() {
		nav.navegarHasta(monumento.getDirecci�n());
		
	}

}