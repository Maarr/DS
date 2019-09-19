package modificadores;

import java.io.IOException;

import fileSystem.Output;

public class EncriptacionOutput implements Output{
	
	private Output[] outputs;

	public EncriptacionOutput(Output ...outputs) {
		this.outputs=outputs;
	}

	@Override
	public void send(char c) throws IOException {
		for(Output output:outputs)
			output.send((char) (c+1));
		
	}

	@Override
	public void close() throws IOException {
		for(Output output:outputs)
			output.close();
		
	}

}