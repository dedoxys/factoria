package ejerciciofactoria;

import java.io.IOException;

public class Coche {

	public Rueda rueda1;
	public Rueda rueda2;
	public Rueda rueda3;
	public Rueda rueda4;
	public Freno freno1;
	public Freno freno2;
	public Freno freno3;
	public Freno freno4;
	public Chasis chasis;
	private Log log;
	
	public Coche () throws InterruptedException, IOException {
		this.log = Log.getInstance();
	}

	public void setRueda1(Rueda _rueda1) throws IOException {
		this.rueda1 = _rueda1;
		this.log.escribirFicheroTxt("poniendo rueda1");
	}

	public void setRueda2(Rueda _rueda2) throws IOException {
		this.rueda2 = _rueda2;
		this.log.escribirFicheroTxt("poniendo rueda1");
	}

	public void setRueda3(Rueda _rueda3) throws IOException {
		this.rueda3 = _rueda3;
		this.log.escribirFicheroTxt("poniendo rueda3");
	}

	public void setRueda4(Rueda _rueda4) throws IOException {
		this.rueda4 = _rueda4;
		this.log.escribirFicheroTxt("poniendo rueda4");
	}

	public void setFreno1(Freno _freno1) throws IOException {
		this.freno1 = _freno1;
		this.log.escribirFicheroTxt("poniendo freno1");
	}

	public void setFreno2(Freno _freno2) throws IOException {
		this.freno2 = _freno2;
		this.log.escribirFicheroTxt("poniendo freno2");
	}

	public void setFreno3(Freno _freno3) throws IOException {
		this.freno3 = _freno3;
		this.log.escribirFicheroTxt("poniendo freno3");
	}

	public void setFreno4(Freno _freno4) throws IOException {
		this.freno4 = _freno4;
		this.log.escribirFicheroTxt("poniendo freno4");
	}

	public void setChasis(Chasis _chasis) throws IOException {
		this.chasis = _chasis;
		this.log.escribirFicheroTxt("poniendo chasis");
	}

}
