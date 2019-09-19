package paq;

public class InstOutput extends Instruccion {
	
	public void ejecutar(MaquinaVirtual maquina) {
		System.out.println(maquina.getPila().pop());
		maquina.incrementarIp();
	}

}
