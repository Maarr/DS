package paq;

import java.util.Scanner;

public class InstInput extends Instruccion {
	
	private static Scanner console = new Scanner(System.in);
	
	public void ejecutar(MaquinaVirtual maquina) {
		System.out.println("Escriba un entero:");
		maquina.getPila().push(console.nextInt());
		maquina.incrementarIp();
	}

}
