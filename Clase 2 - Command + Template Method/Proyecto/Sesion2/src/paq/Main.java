package paq;
import java.io.*;
import java.util.*;

public class Main {

	private static List<Instruccion> instrucciones = new ArrayList<Instruccion>();
	private static MaquinaVirtual maquina;

	

	public static void main(String[] args) throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader("programa.txt"));

		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstrucción(linea);
		fichero.close();
		maquina=new MaquinaVirtual(instrucciones);
		maquina.ejecutarPrograma();

	}

	private static void cargaInstrucción(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		instrucciones.add(decodificarInstruccion(palabras));
	}
	

	
	private static Instruccion decodificarInstruccion(String[] palabras) {
		if (palabras[0].equals("push")) {
				return new InstPush(Integer.parseInt(palabras[1]));		
		} else if (palabras[0].equals("add")) {
			return new InstAdd();
		} else if (palabras[0].equals("sub")) {
			return new InstSub();
		} else if (palabras[0].equals("mul")) {
			return new InstMul();
		} else if (palabras[0].equals("jmp")) {
			return new InstJmp(Integer.parseInt(palabras[1]));
		} else if (palabras[0].equals("jmpg")) {
			return new InstJmpg(Integer.parseInt(palabras[1]));
		} else if (palabras[0].equals("load")) {
			return new InstLoad();
		} else if (palabras[0].equals("store")) {
			return new InstStore();
		} else if (palabras[0].equals("input")) {
			return new InstInput();
		} else if (palabras[0].equals("output")) {
			return new InstOutput();
		}else {
			System.out.println("Instrucción no válida");
			return null;
		}
	}

	
}
