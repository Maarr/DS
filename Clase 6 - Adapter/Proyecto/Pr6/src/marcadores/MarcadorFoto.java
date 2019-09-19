package marcadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import model.Foto;

public class MarcadorFoto implements Marcador {
	
	private Foto foto;
	
	public MarcadorFoto(Foto foto) {
		this.foto=foto;
	}

	@Override
	public Coordenadas getCoordenadas() {
		return foto.getCoordenadas();
	}

	@Override
	public String getTooltipInfo() {
		return foto.getDescripci�n()+" "+foto.getUsuario();
	}

	@Override
	public void abrir() {
		foto.descargar();
		
	}

}
