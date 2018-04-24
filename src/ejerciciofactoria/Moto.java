package ejerciciofactoria;

import java.io.IOException;

public class Moto {

	public Rueda rueda1;
	public Rueda rueda2;
	public Freno freno1;
	public Freno freno2;
	public Chasis chasis;
	private Log log;
	
	public Moto() throws InterruptedException, IOException {
		this.log = Log.getInstance();
	}

	public void setRueda1(Rueda _rueda1) throws IOException {
		this.rueda1 = _rueda1;
		this.log.escribirFicheroTxt("poniendo rueda1");
	}

	public void setRueda2(Rueda _rueda2) throws IOException {
		this.rueda2 = _rueda2;
		this.log.escribirFicheroTxt("poniendo rueda2");
	}

	public void setFreno1(Freno _freno1) throws IOException {
		this.freno1 = _freno1;
		this.log.escribirFicheroTxt("poniendo freno1");
	}

	public void setFreno2(Freno _freno2) throws IOException {
		this.freno2 = _freno2;
		
		this.log.escribirFicheroTxt("poniendo freno2");
	}

	public void setChasis(Chasis _chasis) throws IOException {
		this.chasis = _chasis;
		
		this.log.escribirFicheroTxt("poniendo chasis");
	}

}
