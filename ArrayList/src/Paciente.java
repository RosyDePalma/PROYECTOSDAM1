import java.text.SimpleDateFormat;
import java.util.*;
public class Paciente {
	Scanner lector= new Scanner (System.in);
	
	static int auto=0;
	private int id=++auto;
	private String nom;
	private String data;
	private char sexe='H';
	private double altura;
	private double pes;
	
	


	public Paciente(String nom, String data, char sexe, double altura, double pes) {
		
		this.nom=nom;
		this.data=data;
		this.sexe=sexe;
		this.altura=altura;
		this.pes=pes;	
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	public char getSexe() {
		return sexe;
	}




	public void setSexe(char sexe) {
		this.sexe = sexe;
	}




	public double getAltura() {
		return altura;
	}




	public void setAltura(double altura) {
		this.altura = altura;
	}




	public double getPes() {
		return pes;
	}




	public void setPes(double pes) {
		this.pes = pes;
	}
	
	
	public int edatPacient() {
		Date fechaActual = new Date();
		 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		 String hoy = formato.format(fechaActual);
		 String[] dat1 = this.data.split("/");
		 String[] dat2 = hoy.split("/");
		 int anos = Integer.parseInt(dat2[2]) -
		Integer.parseInt(dat1[2]);
		 int mes = Integer.parseInt(dat2[1]) -
		Integer.parseInt(dat1[1]);
		 	if (mes < 0) {
		 		anos = anos - 1;
		 	} else if 
		 		(mes == 0) {
		int dia = Integer.parseInt(dat2[0]) -
		Integer.parseInt(dat1[0]);
		 	if (dia > 0) {
		 		anos = anos - 1;
		 	}
		 }
		 return anos;
		 }
	public Paciente (){
		System.out.println("Dis-me el nom del pacient");
		String nom = lector.nextLine();
		this.nom=nom;
		
		System.out.println("Dis-me la data del pacient / / /");
		String data = lector.nextLine();
		this.data=data;
		
		System.out.println("Dis-me el sexe del pacient, H o D");
		char sexe = lector.nextLine().charAt(0);
		this.sexe=sexe;
		
	 	System.out.println("Dis-me la l'altura del pacient");
		double altura = lector.nextDouble();
		this.altura=altura;
		
	 	System.out.println("Dis-me el pes del pacient");
		double pes = lector.nextDouble();
		this.pes=pes;
		
	}
	
	public String toString(){
		return "==============" + "\n" + 
				"id=\t" + id + "\n" +
				"nom=\t" + nom + "\n" +
				"edat=\t" + data + "\n" +
				"sexe=\t" + sexe + "\n" +
				"altura=\t" + altura + "\n" +
				"pes=\t" + pes;
	}
	public double IMC(){
		
		return (this.pes/(this.altura*this.altura));
	}
	
	
	}