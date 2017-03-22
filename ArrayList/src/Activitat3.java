import java.util.*;
public class Activitat3 {
public static Scanner lector=new Scanner(System.in);
	public static char[] lletres={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	public static boolean validarNIF(String nif){
		
		boolean correcte=false;
		nif=nif.toUpperCase();
		if (nif.length()!=9) {
			System.out.println("La longitud no es 9");
			return false;
		}else correcte=true;
		
		if ((Character.isLetter(nif.charAt(8)))) {
			correcte=true;
		}else {
			System.out.println("El ultim caracter no es una lletra");
			return false;
		}
		
		for (int i = 0; i < nif.length()-1; i++) {
			if (!Character.isDigit(nif.charAt(i))) {
				
				correcte=false;
				break;
			}
		} 
		
		if (lletres[Integer.valueOf(nif.substring(0, 8))%23]==(nif.charAt(8))&& correcte==true) {
			return correcte;
		}else return false;
		
		
	}

	public static void main(String[] args) {
		
		String nif;
		System.out.println("Disme el NIF");
		nif=lector.nextLine();
		
		
		if (validarNIF(nif)==true) {
			System.out.println("El dni es correcte");
		}else System.out.println("El dni es incorrecte");
		
		
	}

}