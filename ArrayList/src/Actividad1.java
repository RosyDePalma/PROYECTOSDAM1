import java.util.*;
public class Actividad1 {

	public static void numerosTodos(int[] numerosEnteros){
		ArrayList<Integer> numerosParesImpares= new ArrayList<Integer>();
		System.out.println("ArrayList con pares e impares");
		for (int i = 0; i < numerosEnteros.length; i++) {
			if (numerosEnteros[i]%2==0){
				numerosParesImpares.add(0, numerosEnteros[i]);
			}
			else numerosParesImpares.add(numerosEnteros[i]);
		}
		System.out.println(numerosParesImpares);
	}
	
	
		
		public static void main (String[] args){
			Random rnd= new Random();
			int[] numerosEnteros= new int[10];
			System.out.println("Array Generado");
			for (int i = 0; i < numerosEnteros.length; i++) {
				numerosEnteros[i]=rnd.nextInt(50-0+1)+0;
			}
			System.out.println(Arrays.toString(numerosEnteros));
			numerosTodos(numerosEnteros);
	}
}
