import java.util.*;

public class Empleado {
	Scanner lector= new Scanner (System.in);
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo){ //constructor per a definir el nom, l'edat i el sou
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	public Empleado(){ //constructor per a demanar el nom, l'edat i el sou
		System.out.println("Dime el nombre");
		this.nombre=lector.nextLine();
		System.out.println("Dime la edad");
		this.edad=lector.nextInt();
		System.out.println("Dime el sueldo");
		this.sueldo=lector.nextDouble();
	}
	
	
	
	
	public String toString() { //toString
		return "\n ===============" +
				"\n nombre=\t" + nombre + 
				"\n edad=\t" + edad + 
				"\n sueldo=\t" + sueldo;
	}

	//---------------------------------------------GETTERS I SETTERS---------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
