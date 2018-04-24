package ejerciciofactoria;

import java.io.IOException;

public class Piezasfactory {
	
	private Log log;
	
	public Piezasfactory() throws InterruptedException, IOException {
		this.log = Log.getInstance();
	}
	
	public Rueda crearRuedaCoche() throws IOException {
		Rueda r = new Rueda();
		r.setTipo("coche");
		this.log.escribirFicheroTxt("creando rueda coche");
		return r;
	}

	public Rueda crearRuedaMoto() throws IOException {
		Rueda r = new Rueda();
		r.setTipo("moto");
		this.log.escribirFicheroTxt("creando rueda moto");
		return r;
	}

	public Freno crearFrenoCoche() throws IOException {
		Freno f = new Freno();
		f.setTipo("coche");
		this.log.escribirFicheroTxt("creando freno coche");
		return f;
	}

	public Freno crearFrenoMoto() throws IOException {
		Freno f = new Freno();
		f.setTipo("moto");
		this.log.escribirFicheroTxt("creando freno moto");
		return f;
	}

	public Chasis crearChasisCoche() throws IOException {
		Chasis ch = new Chasis();
		ch.setTipo("coche");
		this.log.escribirFicheroTxt("creando chasis coche");
		return ch;
	}

	public Chasis crearChasisMoto() throws IOException {
		Chasis ch = new Chasis();
		ch.setTipo("moto");
		this.log.escribirFicheroTxt("creando chasis moto");
		return ch;
	}

}
