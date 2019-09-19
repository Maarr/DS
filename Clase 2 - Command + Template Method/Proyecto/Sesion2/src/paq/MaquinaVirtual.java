package paq;

import java.util.List;

public class MaquinaVirtual {

	private List<Instruccion> instrucciones;
	private int ip = 0;
	private Memoria memoria = new Memoria();
	private Pila pila = new Pila();

	public MaquinaVirtual(List<Instruccion> instrucciones) {
		this.instrucciones = instrucciones;
	}

	public void ejecutarPrograma() {
		while (ip < instrucciones.size())
			instrucciones.get(ip).ejecutar(this);

	}

	public Memoria getMemoria() {
		return memoria;
	}

	public Pila getPila() {
		return pila;
	}

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public void incrementarIp() {
		ip++;
	}

}
