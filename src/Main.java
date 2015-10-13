
public class Main {

	public static void main(String[] args) {
		int[][] resultados = new int[19][4];
		int size=5000;
		resultados = rellenaTab(resultados, 100000, 0);
		System.out.println(resultados[0][0]+" "+resultados[0][1]+" "+resultados[0][2]+" "+resultados[0][3]);
		
		/*for(int i=0; i<19;i++){
			
			resultados = rellenaTab(resultados, size, i);
			size+=5000;
		}
	*/}
	
	public static void pinta (int[] vector){
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i]+" ");
			
		}
		System.out.println();
	}
	
	public static int[] generaVect (int size){
		int[] vector = new int[size];
		
		for(int i=0;i<size;i++){
			vector[i]= (int) (Math.random()*10000);
		}
		
		return vector;
	}
	
	public static int[][] rellenaTab(int[][] tabla, int size, int indice){
		int maximo, minimo, media, comparacion;
		
		maximo = Algoritmo.algoritmo(generaVect(size));
		minimo = maximo;
		media = maximo;
		for (int i=0; i<50; i++){
			
			comparacion = Algoritmo.algoritmo(generaVect(size));
			
			media = media + comparacion;
			
			if(maximo<comparacion){
				maximo = comparacion;
			}
			
			if(minimo>comparacion){
				minimo = comparacion;
			}
			
			
		}
		media=(int)(media/2);
		
		tabla[indice][0]= size;
		tabla[indice][1]= media;
		tabla[indice][2]= maximo;
		tabla[indice][3]= minimo;
		
		return tabla;
	}

}
