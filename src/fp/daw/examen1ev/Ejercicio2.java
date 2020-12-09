package fp.daw.examen1ev;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(esBisiesto(2020));
	}

	public static boolean esBisiesto(int año) {
		boolean bisiesto = false;
		if ((año % 2 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}
		return bisiesto;
	}

}
