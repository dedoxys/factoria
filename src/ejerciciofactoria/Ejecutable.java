package ejerciciofactoria;

import java.io.IOException;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Log l = Log.getInstance();
		Coche c;
		Rueda r;
		Freno f;
		Chasis ch;
		Moto m;
		Piezasfactory p = new Piezasfactory();
		int entrada = 0;
		Scanner sc = new Scanner(System.in);
		
		while (entrada != 3) {
			System.out.println("Escriba 1 para coche, 2 para moto, 3 para salir");
			entrada = sc.nextInt();
			if (entrada == 1) {
				c = new Coche();
				r = p.crearRuedaCoche();
				f = p.crearFrenoCoche();
				ch = p.crearChasisCoche();
				
				c.setRueda1(r);
				c.setRueda2(r);
				c.setRueda3(r);
				c.setRueda4(r);
				
				c.setFreno1(f);
				c.setFreno2(f);
				c.setFreno3(f);
				c.setFreno4(f);
				
				c.setChasis(ch);

			} else if (entrada == 2) {
				m = new Moto();
				r = p.crearRuedaMoto();
				f = p.crearFrenoMoto();
				ch = p.crearChasisMoto();
				
				m.setRueda1(r);
				m.setRueda2(r);
				
				
				m.setFreno1(f);
				m.setFreno2(f);
				
				m.setChasis(ch);
			} else {
				entrada = 3;
			}

		}
		sc.close();
		l.cerrarFichero();
	}

}
