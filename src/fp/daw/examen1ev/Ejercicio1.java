package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un texto: ");
		String texto = sc.readLine();
		char[] caracteres = new char[texto.length()];
		for (int i = 0; i < texto.length(); i++) {
			caracteres[i] = texto.charAt(i);
		}
		String frase = "";
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] < caracteres[i + 1]) {
				frase = frase + caracteres[i];

			}
		}
		System.out.println(frase);
	}

}
