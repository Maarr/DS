package modificadores;

import java.io.IOException;

import fileSystem.Output;

public class ContarCaracteresOutput implements Output{
	
	private Output output;
	private int num=0;
	
	public ContarCaracteresOutput(Output output) {
		this.output=output;
	}

	@Override
	public void send(char c) throws IOException {
		num++;
		output.send(c);
		
	}

	@Override
	public void close() throws IOException {
		System.out.println("Número de caracteres: "+num);
		output.close();
		
	}

}
