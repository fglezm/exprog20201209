package fp.daw.examen1ev;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(esBisiesto(2020));
	}

	public static boolean esBisiesto(int a�o) {
		boolean bisiesto = false;
		if ((a�o % 2 == 0 && a�o % 100 != 0) || (a�o % 100 == 0 && a�o % 400 == 0)) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}
		return bisiesto;
	}

}
