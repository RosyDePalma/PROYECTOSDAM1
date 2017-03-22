package Pacientes2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class mainPacientes {
	static Scanner lector=new Scanner (System.in);
	public static Pacientes[] arrayPacientes= new Pacientes[20];
	public static DecimalFormat df= new DecimalFormat ("#.##");

public static String estadistiquesPacients(){
	int contaPacients=0;
	double mijaTemp=0, mijaTenS=0, mijaTenD=0;
	
	for(int i=0; i<arrayPacientes.length;i++){
		if (arrayPacientes [i]!=null) {
			contaPacients++;
			mijaTemp+=arrayPacientes[i].getPreRev()[0];
			mijaTenS+=arrayPacientes[i].getPreRev()[1];
			mijaTenD+=arrayPacientes[i].getPreRev()[2];
		}
	}
	return "\n Numero de pacients: " + contaPacients +
	"\n Mija temperatura del pacients: " + df.format(mijaTemp/contaPacients) + 
	"\n Mija tensió sistole del pacients: " + df.format(mijaTenS/contaPacients) +
	"\n Mija tensió diastole del pacients: " + df.format(mijaTenD/contaPacients);
}

 
public static double mijaTemp(Pacientes[] arrayPacientes){
	
	int contaPacients=0;
	double mijaTemp=0;

	for(int i=0; i<arrayPacientes.length;i++){
		if (arrayPacientes [i]!=null) {
			contaPacients++;
			mijaTemp+=arrayPacientes[i].getPreRev()[0];
		}
	}
	return mijaTemp/contaPacients;
}
public static double mijaTenS(Pacientes[] arrayPacientes){

	int contaPacients=0;
	double mijaTenS=0;
	
	for(int i=0; i<arrayPacientes.length;i++){
		if (arrayPacientes [i]!=null) {
			contaPacients++;
			
			mijaTenS+=arrayPacientes[i].getPreRev()[1];
			
		}
		
	}
	return mijaTenS/contaPacients;
}

public static double mijaTenD(Pacientes[] arrayPacientes){
	int contaPacients=0;
	double mijaTenD=0;
	
	for(int i=0; i<arrayPacientes.length;i++){
		if (arrayPacientes [i]!=null) {
			contaPacients++;
			
			mijaTenD+=arrayPacientes[i].getPreRev()[2];
		}
	}
	return mijaTenD/contaPacients;
}

public static void listarPacientes(){
	
	for(int i=0; i<arrayPacientes.length;i++){
		
		if (arrayPacientes [i]!=null)System.out.println(arrayPacientes[i].toString());
	}
}



public static void anyadirPaciente(Pacientes p){
	boolean trobat=false;
	
	for(int i=0; i<arrayPacientes.length;i++){
		if ((arrayPacientes [i]==null) && !trobat)
		{
			arrayPacientes[i]= p;
				System.out.println(arrayPacientes[i].toString() + "\n s'ha inserit correctament");
			trobat =true;
			//arrayPacientes[i]=p;
			break;
		}
	}// fi del for
if (!trobat) System.out.println("No s'ha trobat un buit per a l'alumne");
}


public static void eliminarPacient(String dni){
	for(int i=0; i<arrayPacientes.length;i++){
		if ((arrayPacientes [i]!=null) && (arrayPacientes[i].getNif().equalsIgnoreCase(dni)))
		{
			arrayPacientes[i]= null;
			break;
		}
	}
}



//····································································································································\\


public static void main(String[] args) {
	Pacientes p1=new Pacientes("11111111A","Pepe Garcia",20,36.5,13,6);
	Pacientes p2=new Pacientes("22222222B","Juan Santatecla",38,38.2,13.5,5.5);
	Pacientes p3=new Pacientes("33333333C","Maria Peralta",25,36.7,17.5,7);
	Pacientes p4=new Pacientes("44444444D","Sonia Moran",45,39.2,11,8);
	Pacientes p5=new Pacientes("55555555E","Pedro Ferrer",21,38.5,13,6);
	Pacientes p6=new Pacientes("66666666F","Maria Piera",15,36.2,13,7);

		
	arrayPacientes[0]=p1;
	arrayPacientes[1]=p2;
	arrayPacientes[2]=p3;
	arrayPacientes[3]=p4;
	arrayPacientes[4]=p5;
	arrayPacientes[5]=p6;
	
	

int option=0;
		
do{
	System.out.println();
	System.out.println("MENÚ PRINCIPAL");
	System.out.println("====================");
	System.out.println("1.-Listar las estadisticas de los pacientes que vienen al centro: ");
	System.out.println("2.-Listar todos los pacientes");
	System.out.println("3.-Insertar paciente en array de pacientes ");
	System.out.println("4.-Eliminar paciente del array de pacientes");
			
	System.out.println("0.-Eixir de l'aplicació.");	
			
	System.out.print("Inserta una opció vàlida: ");
	option=lector.nextInt();
	lector.nextLine();
	System.out.println("");
		switch(option){
		//Añadir en cada CASE la etiqueta que anteriormente la hemos utilizado para realizar las operaciones adecuadas a cada etiqueta.
			case 1://FET
				System.out.println(estadistiquesPacients());
				break;
			case 2://FET			
				listarPacientes();
				break;			
			case 3://FET			
				anyadirPaciente(new Pacientes());
				break;				
			case 4://FET
				System.out.println("Disme el DNI que vols borrar:");
				String 	nif=lector.nextLine();
				eliminarPacient(nif);
				break;								
			case 0:
				System.out.println("Aplicació finalitzada.");
				break;				
			default:
				break;
				}	
			}while (option!=0);	
		}
	}

