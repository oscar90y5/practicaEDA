import java.io.IOException;






public class Main {

	public static void main(String[] args) throws IOException{
		int[][] resultados = new int[20][4];
		int size=1500;
		
		//resultados = rellenaTab(resultados, 30000, 0);
		
		//System.out.println(resultados[0][0]+" "+resultados[0][1]+" "+resultados[0][2]+" "+resultados[0][3]);
		
		for(int i=0; i<20;i++){
			
			resultados = rellenaTab(resultados, size, i);
			size+=1500;
		}
		pintaTabla(resultados);
		
		ExportaTabla.exportaTabla(resultados);
		
	}
	
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
		
		for (int i=0; i<20; i++){
			
			comparacion = Algoritmo.algoritmo(generaVect(size));
			
			media = media + comparacion;
			
			if(maximo<comparacion){
				maximo = comparacion;
			}
			
			if(minimo>comparacion){
				minimo = comparacion;
			}
			
			
		}
		media=(int)(media/21);
		
		tabla[indice][0]= size;
		tabla[indice][1]= media;
		tabla[indice][2]= maximo;
		tabla[indice][3]= minimo;
		
		return tabla;
	}
	
	public static void pintaTabla(int[][] tabla){
		System.out.println("Nº ele| Media | Máximo | Minimo");
		for (int i=0; i<20;i++){
			for(int j =0; j<4;j++){
				System.out.print(tabla[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
