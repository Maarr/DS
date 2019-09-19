package paq;

public class InstSub extends Instruccion {
	
	public void ejecutar(MaquinaVirtual maquina)
	{
		int b = maquina.getPila().pop();
		int a = maquina.getPila().pop();
		maquina.getPila().push(a - b);
		maquina.incrementarIp();
	}

}
