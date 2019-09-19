package modificadores;

import java.io.IOException;

import fileSystem.Output;

public class EliminacionEspaciosOutput implements Output{
	
	private Output output;
	private char aux='.';

	public EliminacionEspaciosOutput(Output output) {
		this.output=output;
	}

	@Override
	public void send(char c) throws IOException {
		if(!Character.isWhitespace(c) && c!=aux) {
			output.send(c);
			aux=c;
		}
		
	}

	@Override
	public void close() throws IOException {
		output.close();
		
	}


}
