
public class Algoritmo {
	public static int algoritmo(int[] vector){
		/* Calculamos h con el dni: "12425734"
		 * sumamos 0,5 para redondear
		 */
		int h = (int) (Math.pow(vector.length,0.734) + 1.425 +0.5);
		
		
	
	}
	//FUNCIONA! ta probao
	public  int[] ordInser(int[] vector){
		int aux; // variable auxiliar para cambiar valores en los vectores
		for(int i=0;i<vector.length;i++){
			for(int j=i;j<vector.length;j++){
				if(j+1<vector.length){
					if(vector[j]>vector[j+1]){
						
					}
				}
			}
		}
		return vector;
	}

	
}	
