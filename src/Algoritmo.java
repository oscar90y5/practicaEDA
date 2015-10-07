
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
	public static int[] ordInserTroz(int[] vector, int h){
		int aux; // variable auxiliar para cambiar valores en los vectores
		for(int t=0; t<h;t++){	
			
			for(int i=t;i<vector.length;i=i+h){
				
				for(int j=t;j<vector.length;j=j+h){
					
					if(j+h<vector.length){
						if(vector[j]>vector[j+h]){
							
							aux=vector[j];
							vector[j]=vector[j+h];
							vector[j+h]=aux;
						}
					}
				}
			}
		}	
		return vector;
	}
	
	//VA FERPE (borrar)
	//ordena el vector total
	public static int[] ordInserTotal(int[] vector){
		int aux; // variable auxiliar para cambiar valores en los vectores
		
		for(int i=0;i<vector.length;i++){
			for(int j=0;j<vector.length;j++){
				if(j+1<vector.length){
					if(vector[j]>vector[j+1]){
						aux=vector[j];
						vector[j]=vector[j+1];
						vector[j+1]=aux;
					}
				}
			}
		}
		return vector;
	}

	
}	
