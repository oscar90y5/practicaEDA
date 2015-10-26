/**
 * 
 * @author Iván Castaño Fernández
 * @author Óscar Fernández Angulo
 */

public class Algoritmo {
	/**
	 * variable en la que se almacena el numero de comparaciones que realiza el
	 * algoritmo.
	 */
	private static int comparaciones;

	/**
	 * Metodo que mide el numero de comparaciones necesarias para ordenar un
	 * vector aleatorio por el algoritmo Shell-(h,1).
	 * 
	 * @param vector que deseamos analizar.
	 * @return comparaciones
	 */
	public static int algoritmo(int[] vector) {
		/**
		 * Calculamos h con el dni: "12425734" sumamos 0,5 para redondear
		 */
		int h = (int) (Math.pow(vector.length, 0.734) * 1.425 + 0.5);
		comparaciones = 0;

		ordInserTotal(ordInserTroz(vector, h));

		return comparaciones;
	}

	/**
	 * Ordena con el algoritmo de insercion h segmentos del vector.
	 * 
	 * @param vector a ordenar.
	 * @param h numero de segmentos en los que dividimos el vector.
	 * @return vector ordenado en segmentos.
	 */
	private static int[] ordInserTroz(int[] vector, int h) {
		/**
		 * variable auxiliar para cambiar valores en los vectores.
		 */
		int aux;

		for (int t = 0; t < h; t++) {

			for (int i = t + h; i < vector.length; i = i + h) {

				for (int j = i; j >= h; j = j - h) {
					comparaciones++;
					if (vector[j] < vector[j - h]) {
						aux = vector[j];
						vector[j] = vector[j - h];
						vector[j - h] = aux;
					} else {
						break;
					}
				}
			}
		}
		return vector;
	}

	/**
	 * Ordena con el algoritmo de insercion el vector.
	 * 
	 * @param vector a ordenar.
	 */
	private static void ordInserTotal(int[] vector) {
		/**
		 * variable auxiliar para cambiar valores en los vectores.
		 */
		int aux;
		for (int i = 1; i < vector.length; i++) {

			for (int j = i; j >= 1; j--) {
				comparaciones++;

				if (vector[j] < vector[j - 1]) {

					aux = vector[j];
					vector[j] = vector[j - 1];
					vector[j - 1] = aux;

				} else {
					break;
				}
			}
		}

	}

}
