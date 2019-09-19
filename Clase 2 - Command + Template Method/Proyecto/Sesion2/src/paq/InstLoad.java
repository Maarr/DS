package paq;

public class InstLoad extends Instruccion {
	
	public void ejecutar(MaquinaVirtual maquina) {
		int direccion = maquina.getPila().pop();
		maquina.getPila().push(maquina.getMemoria().getValor(direccion));
		maquina.incrementarIp();
	}

}
