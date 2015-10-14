
public class Algoritmo {
	
	private static int comparaciones;
	
	public static int algoritmo(int[] vector){
		/* Calculamos h con el dni: "12425734"
		 * sumamos 0,5 para redondear
		 */
		//System.out.println(vector.length);
		int h = (int) (Math.pow(vector.length,0.734)* 1.425 +0.5);
		comparaciones =0;
		
		//devolvemos el vector ordenado
		ordInserTotal(ordInserTroz(vector,h));
		
		return comparaciones;
		
		
	
	}
	//FUNCIONA! ta probao (BORRAR xD)
	//ordena los h subvectores
	private static int[] ordInserTroz(int[] vector, int h){
		int aux; // variable auxiliar para cambiar valores en los vectores
		//System.out.println(vector.length);
		for(int t=0; t<h;t++){	
			
			for(int i=t+h;i<vector.length;i=i+h){
				
				for(int j=i;j>=h;j=j-h){
					//System.out.println("bucle 1");
					comparaciones ++;
					if(vector[j]<vector[j-h]){
						aux=vector[j];
						vector[j]=vector[j-h];
						vector[j-h]=aux;
					} else {
						break;
					}
				}
			}
		}	
		return vector;
	}
	
	//VA FERPE (borrar)
	//ordena el vector total
	private static void ordInserTotal(int[] vector){
		int aux; // variable auxiliar para cambiar valores en los vectores
		//System.out.println(vector.length);
		for(int i=1;i<vector.length;i++){
			for(int j=i;j>=1;j--){
				//System.out.println("bucle 2");
				comparaciones ++;
				if(vector[j]<vector[j-1]){
					aux=vector[j];
					vector[j]=vector[j-1];
					vector[j-1]=aux;
				} else {
					break;
				}
			}
		}
		//Main.pinta(vector);
		
	}

	
}	
