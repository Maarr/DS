package paq;

public class InstJmp extends Instruccion {
	
	private int valor;
	
	public InstJmp(int valor) {
		 this.valor=valor;
	 }
	public void ejecutar(MaquinaVirtual maquina) {
		maquina.setIp(valor);
	}
}
