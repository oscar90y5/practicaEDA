
public class Main {

	public static void main(String[] args) {
		int[] vector = {13,11,65,3,7,6,34,345,667,23,87,5};
		
		double[][] resultados = new double[20][4];
		
		
		pinta(Algoritmo.algoritmo(vector));

	}
	
	public static void pinta (int[] vector){
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i]+" ");
			
		}
		System.out.println();
	}
	
	

}
