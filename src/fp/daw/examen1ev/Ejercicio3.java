package fp.daw.examen1ev;

import java.util.Scanner;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.- Evaluar");
		System.out.println("2.- Salir");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Dime la variable: ");
			double x = sc.nextInt();
			System.out.println("¿cuántos coeficientes?: ");
			int n = sc.nextInt();
			System.out.println("Dime los coeficientes separados por espacios en blanco: ");
			for (int y = 0; y < n; y++) {
				double[] coeficientes = new double[n];
				System.out.println(evaluar(x, coeficientes));
			}
			break;
		case 2:
			break;
		}
	}

	public static double evaluar(double x, double[] coeficientes) {
		double resultado = 0;
		for (int i = 0; i <= coeficientes.length; i++) {
			resultado = resultado + coeficientes[i] * Math.pow(x, i);
		}
		return resultado;
	}

}
