import java.util.*;
import java.text.*;
public class mainPaciente {
	static Scanner lector= new Scanner (System.in);
	static DecimalFormat df= new DecimalFormat ("#.##");
	public static ArrayList<Paciente> listaPacientes= new ArrayList<Paciente>(); //declarar Array pacients
	
	//---------------------------------------OPCIO 1---------------------------------------
	public static void crearPacient(Paciente p){
		
		
		for(int i=0; i<listaPacientes.size();i++){
				listaPacientes.add(p);
					System.out.println(listaPacientes.get(i).toString() + "\n s'ha inserit correctament");
					break;
			}
		}// fi del for
	
	//---------------------------------------OPCIO 2---------------------------------------
	public static void llistatPacientes(){
		for (int i = 0; i < listaPacientes.size(); i++) {
			System.out.println(listaPacientes.get(i).toString());
		}
	}
	//---------------------------------------OPCIO 3---------------------------------------
	public static int[] majorMenor(){
		int major=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int posMin=-1;
		int posMax=1;
		int[] arrayMenorMajor= new int[2];
		for (int i = 0; i < listaPacientes.size(); i++) {
			if (listaPacientes.get(i).edatPacient()>major){
				major=listaPacientes.get(i).edatPacient();
				arrayMenorMajor[0]= listaPacientes.get(i).edatPacient();
				posMax=-1;
			}
			if (listaPacientes.get(i).edatPacient()<menor){
				menor=listaPacientes.get(i).edatPacient();
				arrayMenorMajor[1]= listaPacientes.get(i).edatPacient();
				posMin=-1;
			}

		}
		arrayMenorMajor[0]=posMin;
		arrayMenorMajor[1]=posMax;
		return arrayMenorMajor;
	}
	//---------------------------------------OPCIO 4---------------------------------------
	public static int[] pacientsPerSexe(){
		
		int[] arrayPacientsPerSexe= new int[2];
		
		
		for (int i = 0; i < listaPacientes.size(); i++) 
			if (listaPacientes.get(i).getSexe()=='H'){
				arrayPacientsPerSexe[0]++;
			
			}else{
				arrayPacientsPerSexe[1]++;
			}
		return arrayPacientsPerSexe;
	}
	//---------------------------------------OPCIO 5---------------------------------------
		public static void estadistiquesPerSexe(){
		
		int contaPacients=0, posEdatMin=0, posAltMax=0, edatMin=120;
		double totalPes=0, alturaMax=0;
		char resposta;
		
		System.out.println("Quines estadistiques vols saber H/D");
		resposta=lector.nextLine().charAt(0);
		
		for (int i = 0; i < listaPacientes.size(); i++) {
		
			if(listaPacientes.get(i).getSexe()==resposta) {
				contaPacients++;
				totalPes+=listaPacientes.get(i).getPes();
				if(listaPacientes.get(i).getAltura()>alturaMax){
					alturaMax=listaPacientes.get(i).getAltura();
					posAltMax=i;
					
				}
				if(listaPacientes.get(i).edatPacient()<edatMin){
					edatMin=listaPacientes.get(i).edatPacient();
					posEdatMin=i;
				}
			}
			System.out.println("El numero de pacients del sexe " + resposta + " es: " + contaPacients);
			System.out.println("El pacient més alt ocupa la posició: " + posAltMax + " i es " +
			listaPacientes.get(posAltMax).toString());
			System.out.println("El pacient mes jove ocupa la posició: " + posEdatMin +
			" i es " + listaPacientes.get(posEdatMin).toString());
			System.out.println("La mitjana del pes es: " + df.format(totalPes/contaPacients));
			
			
		}
		
		}
			
		
	
		
		
		//---------------------------------------OPCIO 6---------------------------------------	
		
		public static void buscaPacient(int id){
			
			for (int i = 0; i < listaPacientes.size(); i++) {
				if (listaPacientes.get(i).getId()==id){
				System.out.println(listaPacientes.get(i).toString());
			}
			}
		}
		
		//---------------------------------------OPCIO 7---------------------------------------	
		public static void mensajeIMC (double imc){
			
			if(imc<18.5){
				System.out.println("Pes Insuficiente");
			}
			else if(imc<24.9){
				System.out.println("Pes normal");
				
			}else if(imc<26.9){
				System.out.println("Sobre grau I");
				
			}else if(imc<29.9){
				System.out.println("Sobrepes grau II");
			
			}else 
				System.out.println("Sobrepes grau III");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Crear els pacients i omplir l'array");
		
		Paciente p1= new Paciente ("Jose", "12/02/1980", 'D', 1.63, 57);
		Paciente p2= new Paciente ("Sergio", "07/03/1990", 'D', 1.74, 60.5);
		Paciente p3= new Paciente ("Ricardo", "20/03/1967", 'D', 1.62, 50.8);
		Paciente p4= new Paciente ("Jaume", "20/04/1972", 'H', 1.78, 72.5);
		Paciente p5= new Paciente ("Victor", "29/02/1960", 'H', 1.8, 85.2);
		
		
		listaPacientes.add(p1);
		listaPacientes.add(p2);
		listaPacientes.add(p3);
		listaPacientes.add(p4);
		listaPacientes.add(p5);
		
		int option=0;
		
		do{
		System.out.println("--------------------MENU--------------------");
		System.out.println("1- Crear pacient demanant les dades");
		System.out.println("2- Llistar pacient");
		System.out.println("3- Pacient major i menor");
		System.out.println("4- Pacients per sexe");
		System.out.println("5- Estadistiques per sexe");
		System.out.println("6- Buscar pacient pel seu ID");
		System.out.println("7- Calcular tabla IMC de tots els pacients");
		System.out.println("0- IXIR DE L'APLICACIÓ");
		
		System.out.println("Inserta una opció valida");
		option=lector.nextInt();
		lector.nextLine();
		System.out.println("");
		switch(option){
			case 1:
				crearPacient(new Paciente());
				break;
			case 2:
				llistatPacientes();
				break;
			case 3:
				int[]minMax=majorMenor();
				System.out.println("La posicio que ocupa l'edat minima es: "+ minMax[0]);
				System.out.println(listaPacientes.get(minMax[0]).toString());
				System.out.println("La posicio que ocupa l'edat maxima es: "+ minMax[1]);
				System.out.println(listaPacientes.get(minMax[1]).toString());
				break;
			case 4:
				int[]perSexe=pacientsPerSexe();
				
				System.out.println("Quantitat de pacients per sexe: ");
				
				System.out.println("Homens: "+ perSexe[0]);
				
				System.out.println("Dones: "+ perSexe[1]);
				break;
			case 5:
				estadistiquesPerSexe();
				break;
			case 6:
				System.out.println("Disme el id que vols buscar:");
				int id=lector.nextInt();
				buscaPacient(id);
				break;
			case 7:
				for(int i=0; i<listaPacientes.size(); i++){
					System.out.println("Paciente num " + listaPacientes.get(i).getId() + 
							" tiene el IMC " + listaPacientes.get(i).IMC()); 
					mensajeIMC(listaPacientes.get(i).IMC());
				}
				break;
			case 0:
				System.out.println("PROGRAMA FINALITZAT!");
				break;
		} 
	
	}while(option!=0);

	

}

}
