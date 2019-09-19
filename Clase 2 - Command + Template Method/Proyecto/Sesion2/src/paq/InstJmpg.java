package paq;

public class InstJmpg extends Instruccion{
	
private int valor;
	
	public InstJmpg(int valor) {
		 this.valor=valor;
	 }
	public void ejecutar(MaquinaVirtual maquina) {
		int b = maquina.getPila().pop();
		int a = maquina.getPila().pop();
		if (a > b)
			maquina.setIp(valor);
		else
			maquina.incrementarIp();
	}

}
