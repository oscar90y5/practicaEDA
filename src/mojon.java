import java.util.ArrayList;


public class mojon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int maximo, minimo, media, comparacion;
		
		//maximo = Algoritmo.algoritmo(generaVect(size));
		//minimo = maximo;
		//media = maximo;
		maximo=0;
		minimo=0;
		media=0;
		for (int i=0; i<30; i++){
			int[] vector=Main.generaVect(2);
			comparacion = Algoritmo.algoritmo(vector);
			System.out.println(Algoritmo.algoritmo(vector));
			System.out.println("vector: "+vector[0]+" "+vector[1]);
			System.out.println("comparaciones: "+comparacion);
			media = media + comparacion;
			
			if(maximo<comparacion){
				maximo = comparacion;
			}
			
			if(minimo>comparacion){
				minimo = comparacion;
			}
			System.out.println("maximo: "+maximo);
			
		}
		media=(int)(media/3);
		
	
	}	
}

	