package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class MarcadorRestaurante implements Marcador{
	
	private Restaurante restaurante;
	
	public MarcadorRestaurante(Restaurante restaurante) {
		this.restaurante=restaurante;
	}

	@Override
	public Coordenadas getCoordenadas() {
		Navegador nav=new Navegador();
		return nav.getCoordenadas(restaurante.getDirecci�n());
	}

	@Override
	public String getTooltipInfo() {
		return restaurante.getNombre()+" "+restaurante.getTel�fono();
	}

	@Override
	public void abrir() {
		restaurante.llamar();
		
	}

}