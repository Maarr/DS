package cambios;


import editor.Figura;

public class CambioMover implements Cambio{
	

	private Figura figura;
	
	private int dx;
	private int dy;
	
	public CambioMover(int dx,int dy,Figura figura) {
		this.dx=dx;
		this.dy=dy;
		this.figura=figura;
	}

	@Override
	public void undo() {
			figura.mover(-dx,-dy);
	}

	@Override
	public void redo() {
			figura.mover(dx,dy);
		
	}

}
