import java.util.*;
public class mainEmpleado {
	
	public static Empleado sueldoMasAlto(ArrayList<Empleado> listaEmpleado){
		double sueldoMax=0;
		int pos=-1;
		
		for (int i = 0; i < listaEmpleado.size(); i++) {
			if(sueldoMax<listaEmpleado.get(i).getSueldo()){
				sueldoMax=listaEmpleado.get(i).getSueldo();
				pos=i;
			
			}
		}
		if(pos!=-1)
			return listaEmpleado.get(pos);
		else{
			System.out.println("La lista esta vacia");
			return null;
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner lector= new Scanner (System.in);
		
		String respuesta; //crear String per a fer la resposta de si continuar creeantne o no
		Empleado e; //crear un empleat
		ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>(); //crear array empleats
		ArrayList<Empleado> listaInversa= new ArrayList<Empleado>(); //per a l'array invers
		
		Empleado e1= new Empleado("Jaume", 19, 100000);
		Empleado e2= new Empleado("Pepe", 20, 65454);
		Empleado e3= new Empleado("Juan", 21, 51554);
		Empleado e4= new Empleado("Pedro", 22, 2411);
		
		listaEmpleados.add(e1); //anyadir cada empleat que hem creat a l'array
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		
		
		do{
			e=new Empleado();
			listaEmpleados.add(e);
			System.out.println("Quieres insertar algun empleado mas? (S/N)");
			respuesta=lector.nextLine();
		}while(respuesta.equalsIgnoreCase("S")); //Si posem que si es faran mes empleats un N sera que no volem posarne mes
		
		for (int i = 0; i < listaEmpleados.size(); i++) { //recorrer l'array dels empleats per agafarlos d'un en un
			System.out.println(listaEmpleados.get(i).toString()); //agafar l'empleat i ferle toString
		}
		for(Empleado nuevoE: listaEmpleados){
			System.out.println(nuevoE.toString());
		}
		if(sueldoMasAlto(listaEmpleados).toString()!=null){
		System.out.println("El empleado con el sueldo mas alto es:\t "+ sueldoMasAlto(listaEmpleados).toString());
	}
		System.out.println("Vamos a invertir la lista");
		for (int i=listaInversa.size();i>=0; i--) {
			listaInversa.add(listaEmpleados.get(i));
			
		}
		System.out.println(listaInversa);
		System.out.println("Contiene el empleado 2?");
		System.out.println(listaEmpleados.contains(e2));
		System.out.println("Buscar un empleado por su nombre");
		System.out.println("Dime el nombre que quieres buscar");
		String nombreN=lector.nextLine();
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if(nombreN.equalsIgnoreCase(listaEmpleados.get(i).getNombre()))
				System.out.println("persona encontrada");
		}
		System.out.println("Preguntar si el array esta vacio");
		System.out.println(listaEmpleados.isEmpty());
		
		System.out.println("Posicion que ocupa el empleado 3");
		System.out.println(listaEmpleados.indexOf(e3));
}
}