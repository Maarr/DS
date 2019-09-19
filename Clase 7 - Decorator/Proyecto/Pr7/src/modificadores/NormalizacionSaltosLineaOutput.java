package modificadores;

import java.io.IOException;

import fileSystem.Output;

public class NormalizacionSaltosLineaOutput implements Output{
	
	private Output output;

	public NormalizacionSaltosLineaOutput(Output output) {
		this.output=output;
	}

	@Override
	public void send(char c) throws IOException {
		if(c!='\r')
			output.send(c);
		
	}

	@Override
	public void close() throws IOException {
		output.close();
		
	}	

}
