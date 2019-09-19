package paq;

public class InstStore extends Instruccion{
	
	public void ejecutar(MaquinaVirtual maquina) {
		int valor = maquina.getPila().pop();
		int direccion = maquina.getPila().pop();
		maquina.getMemoria().setValor(valor, direccion);
		maquina.incrementarIp();
	}

}
