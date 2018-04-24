package ejerciciofactoria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {

	private static Log instance;
	private FileWriter fw;

	private Log() throws IOException {
		
		this.fw = new FileWriter("fichero.txt",true);
	}

	public static Log getInstance() throws InterruptedException, IOException {

		if (instance == null) {
			instance = new Log();
		}

		return instance;
	}

	public static File abrirFichero(String _fichero) {
		File archivo = new File(_fichero + ".txt");
		return archivo;

	}

	public void escribirFicheroTxt(String paso) throws IOException {
		
				this.fw.write(paso + "\n");

	}
	
	
	public void cerrarFichero() throws IOException {
		this.fw.close();
	}
	
}
