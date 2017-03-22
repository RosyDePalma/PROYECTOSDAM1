import java.util.*;
public class mainHola {

	public static Scanner lector=new Scanner (System.in);
	
	public static hola[] arrayHola= new hola[10];
	public static ArrayList<hola> listaHola= new ArrayList<hola>();
	
	public static String canviarHola(){
		System.out.println("Dime algo");
		String algo=lector.nextLine();
		return algo;
	}
	
	public static void listarHolasList(){
		for(int i=0; i<listaHola.size(); i++){
			
			System.out.println(listaHola.get(i).toString());
		}
	}
	
	public static void listarHolasArray(hola[] arrayHola){
		
		for (int i = 0; i < arrayHola.length; i++) {
			if(arrayHola[i] != null){
				System.out.println(arrayHola[i].toString());
			}
		}
		
	}
	
	
	
	
	
	public static void main (String[] args){
		
		
		
		
		arrayHola[0]= new hola ("Jaume", 19, "hola");
		arrayHola[1]= new hola ("Jefas", 17, "hoa");
		
		
		hola h1= new hola ("Jaume", 19, "hola");
		
		listaHola.add(h1);
		
		
		
		
		
		
		
		
		int option=0;
		do{
			
			System.out.println("--------Menu---------");
			System.out.println("1-.-----algo---------");
			
			
			
			
			
			System.out.println("Dime una opcio");
			option=lector.nextInt();
			System.out.println("");
			
			switch(option){
			
				case 1:
					System.out.println(canviarHola());
					break;
				case 2:
					listarHolasList();
					break;
				case 3:
					listarHolasArray(arrayHola);
					break;
			
			
			}
			
			
			
		}while(option!=0);
			
			
			
		
		
		
		
		
		
		
		
		
		
	}
}
