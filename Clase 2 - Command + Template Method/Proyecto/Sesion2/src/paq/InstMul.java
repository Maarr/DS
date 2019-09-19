package paq;

public class InstMul extends Instruccion{
	
	public void ejecutar(MaquinaVirtual maquina) {
		maquina.getPila().push(maquina.getPila().pop() * maquina.getPila().pop());
		maquina.incrementarIp();
	}

}
