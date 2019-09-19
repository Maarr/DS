package main;
import java.io.*;

import fileSystem.FileSystem;
import modificadores.ContarCaracteresOutput;
import modificadores.EliminacionEspaciosOutput;
import modificadores.EncriptacionOutput;
import modificadores.NormalizacionSaltosLineaOutput;
import outputs.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		fs.copy("privado.txt", new FileOutput("copia.txt"));
		fs.copy("privado.txt", new InternetOutput("1.1.1.1"));
		fs.copy("privado.txt", new BluetoothOutput("iPhone"));
		
		fs.copy("privado.txt", new NormalizacionSaltosLineaOutput(new FileOutput("a.txt")));
		fs.copy("privado.txt", new NormalizacionSaltosLineaOutput(new EncriptacionOutput(new FileOutput("b.txt"))));
		
		fs.copy("privado.txt", new NormalizacionSaltosLineaOutput(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new EliminacionEspaciosOutput(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new NormalizacionSaltosLineaOutput(new EliminacionEspaciosOutput(new InternetOutput("1.1.1.1"))));
	
		fs.copy("privado.txt", new ContarCaracteresOutput(new BluetoothOutput("iPhone")));
		fs.copy("privado.txt", new ContarCaracteresOutput(new NormalizacionSaltosLineaOutput(new ContarCaracteresOutput(new BluetoothOutput("iPhone")))));
		
		fs.copy("privado.txt", new EncriptacionOutput(new InternetOutput("1.1.1.1"),new BluetoothOutput("iPhone")));
	}

}