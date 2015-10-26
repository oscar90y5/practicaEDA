/**
 * 
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 *
 */
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 * Tabla donde almacenamos los resultados.
		 */
		int[][] resultados = new int[20][4];
		/**
		 * Variable en la que se almacena el numero de elementos del vector.
		 */
		int size = 1500;

		

		for (int i = 0; i < 20; i++) {

			resultados = rellenaTab(resultados, size, i);
			size += 1500;
		}
		pintaTabla(resultados);

		ExportaTabla.exportaTabla(resultados);

	}

	/**
	 * Imprime el vector en la consola.
	 * @param vector 
	 */
	public static void pinta(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");

		}
		System.out.println();
	}

	/**
	 * Genera vectores aleatorios.
	 * @param size
	 * @return
	 */
	public static int[] generaVect(int size) {
		int[] vector = new int[size];

		for (int i = 0; i < size; i++) {
			vector[i] = (int) (Math.random() * 10000);
		}

		return vector;
	}

	/**
	 * rellena una posicion de la tabla con los valores medios maximos y minimos de un tamaño de vector determinado.
	 * @param tabla array bidimensional donde deseamos almacenar los resultados.
	 * @param size tamaño de los vectores que vamos a almacenar.
	 * @param indice posicion de la tabla que vamos a rellenar.
	 * @return devuelve la tabla con una fila rellena.
	 */
	public static int[][] rellenaTab(int[][] tabla, int size, int indice) {
		int maximo, minimo, media, comparacion;

		maximo = Algoritmo.algoritmo(generaVect(size));
		minimo = maximo;
		media = maximo;

		for (int i = 0; i < 20; i++) {

			comparacion = Algoritmo.algoritmo(generaVect(size));

			media = media + comparacion;

			if (maximo < comparacion) {
				maximo = comparacion;
			}

			if (minimo > comparacion) {
				minimo = comparacion;
			}

		}
		media = (int) (media / 21);

		tabla[indice][0] = size;
		tabla[indice][1] = media;
		tabla[indice][2] = maximo;
		tabla[indice][3] = minimo;

		return tabla;
	}
	
	/**
	 * imprime los resultados por pantalla.
	 * @param tabla array bidimensional que deseamos imprimir.
	 */
	public static void pintaTabla(int[][] tabla) {
		System.out.println("Nº ele| Media | Máximo | Minimo");
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(tabla[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
