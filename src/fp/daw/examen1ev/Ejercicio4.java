package fp.daw.examen1ev;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[][] matrizMxN = { { 1, 5, 5, 2, 4 }, { 2, 1, 4, 14, 3 }, { 3, 7, 11, 2, 8 }, { 4, 8, 12, 16, 4 } };
		System.out.println(max3x3sum(matrizMxN));
	}

	public static int max3x3sum(int[][] matrizMxN) {
		if (matrizMxN.length < 3 || matrizMxN[1].length < 3) {
			return 0;
		}
		int[] suma = new int[3];
		int sumaMatriz = 0;
		for (int x = 0; x < matrizMxN.length; x++) {
			for (int i = x; i < x + 2; i++) {
				for (int j = x; j < x + 2; j++) {
					sumaMatriz = sumaMatriz + matrizMxN[i][j];
					suma[x] = sumaMatriz;
				}
			}
			x = x++;
		}
		return sumaMatriz;
	}

}
