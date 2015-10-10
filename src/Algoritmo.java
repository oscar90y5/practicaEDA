
public class Algoritmo {
	public static int[] algoritmo(int[] vector){
		/* Calculamos h con el dni: "12425734"
		 * sumamos 0,5 para redondear
		 */
		int h = (int) (Math.pow(vector.length,0.734) + 1.425 +0.5);
		
		//devolvemos el vector ordenado
		return ordInserTotal(ordInserTroz(vector,h));
		
		
		
	
	}
	//FUNCIONA! ta probao (BORRAR xD)
	//ordena los h subvectores
	private static int[] ordInserTroz(int[] vector, int h){
		int aux; // variable auxiliar para cambiar valores en los vectores
		for(int t=0; t<h;t++){	
			
			for(int i=t+h;i<vector.length;i=i+h){
				
				for(int j=i;j>=h;j=j-h){
					
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
	private static int[] ordInserTotal(int[] vector){
		int aux; // variable auxiliar para cambiar valores en los vectores
		
		for(int i=1;i<vector.length;i++){
			for(int j=i;j>=1;j--){
				if(vector[j]<vector[j-1]){
					aux=vector[j];
					vector[j]=vector[j-1];
					vector[j-1]=aux;
				} else {
					break;
				}
			}
		}
		return vector;
	}

	
}	
