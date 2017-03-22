import java.util.*;
public class hola {
Scanner lector= new Scanner (System.in);
	static int auto=0;
	private int id=++auto;
	private String nom;
	private int edat;
	private String hola;
	
	public hola(String nom, int edat, String hola){
		this.nom=nom;
		this.edat=edat;
		this.hola=hola;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public int getEdat(){
		return edat;
	}
	
	public void getEdat(int edat){
		this.edat=edat;
	}
	
	public String getHola(){
		return hola;
	}
	
	public void setHola(String hola){
		this.hola=hola;
	}
	
	
	public hola(){
		
		System.out.println("Dis-me el nom");
		nom=lector.nextLine();
		this.nom=nom;
		
		System.out.println("Dis-me l'edat");
		edat=lector.nextInt();
		this.edat=edat;
		
		System.out.println("Dis-me el hola");
		hola=lector.nextLine();
		this.hola=hola;
	}
	
	
	
	
	public String toString(){
		
		return "==============" +
		
				"id=\t" + id + "\n" +
				"nom\t" + nom + "\n" +
				"edat=\t" + edat + "\n" +
				"hola=\t" + hola + "\n";

	}
	
	
	
}
