package Pacientes2;

import java.util.*;

public class Pacientes {
	static Scanner lector=new Scanner (System.in);

	private String Nif,nom;
	private int edat;
	private double[] preRev=new double[3];


public Pacientes(String Nif, String nom, int edat, double temp, double tenSis, double tenDias){
	//ident sera automatic 
		this.Nif=Nif;
		this.nom=nom;
		this.edat=edat;
		this.preRev[0]=temp;
		this.preRev[1]=tenSis;
		this.preRev[2]=tenDias;		
	}


	public String getNif() {
		return Nif;
	}
	public void setNif(String nif) {
		Nif = nif;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public double[] getPreRev() {
		return preRev;
	}
	public void setPreRev(double[] preRev) {
		this.preRev = preRev;
	}
								
					
		public Pacientes (){
		String nifPac, nomPac;
		int edatPac;
		double temp, tenSis, tenDias;
		
		System.out.println("Dis-me el Nif del pacient:");
		 nifPac=lector.nextLine();
		this.Nif=nifPac;
		
		System.out.println("Dis-me el nom del pacient:");
		 nomPac=lector.nextLine();
		this.nom=nomPac;
		
		System.out.println("Dis-me l'edat del pacient:");
		 edatPac=lector.nextInt();
		lector.nextLine();	
		this.edat=edatPac;
		
		System.out.println("Dis-me la temperatura del pacient:");
		 temp=lector.nextDouble();
		lector.nextLine();
		this.preRev[0]=temp;
		
		System.out.println("Dis-me la tenSis del pacient:");
		 tenSis = lector.nextDouble();
		lector.nextLine();
		this.preRev[1]=tenSis;
		
		System.out.println("Dis-me la tenDias del pacient:");
		 tenDias=lector.nextDouble();
		lector.nextLine();
		this.preRev[2]=tenDias;
	}				
//···················································································································\\

		
	public String toString() {
		return "=================" + "\n" +
				"Nif=\t" + Nif + "\n" +
				"nom=\t" + nom + "\n" +
				"edat=\t" + edat + "\n" +
				"temperatura/tenSis/tenDias=\t" + Arrays.toString(preRev)+"\n";
	}
}