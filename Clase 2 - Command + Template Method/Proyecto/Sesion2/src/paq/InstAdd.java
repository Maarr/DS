package paq;

public class InstAdd extends Instruccion {
	
	public void ejecutar(MaquinaVirtual maquina) {
		maquina.getPila().push(maquina.getPila().pop() + maquina.getPila().pop());
		maquina.incrementarIp();
	}

}
