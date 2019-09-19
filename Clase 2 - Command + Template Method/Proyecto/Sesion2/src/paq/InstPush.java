package paq;

public class InstPush extends Instruccion {
	
	 private int valor;
	 
	 public InstPush(int valor) {
		 this.valor=valor;
	 }
	
	public void ejecutar(MaquinaVirtual maquina)
	{
		maquina.getPila().push(valor);
		maquina.incrementarIp();
	}
}
