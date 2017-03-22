package Pacientes2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pacientsTest {
	public static Pacientes[] arrayPacientes= new Pacientes[20];
	
	@Test
	public void mijaTempTest() {
		arrayPacientes[0]=new Pacientes("11111111A","Pepe Garcia",20,36.5,13,6);
		arrayPacientes[1]=new Pacientes("22222222B","Juan Santatecla",38,38.2,13.5,5.5);
		arrayPacientes[2]=new Pacientes("33333333C","Maria Peralta",25,36.7,17.5,7);
		arrayPacientes[3]=new Pacientes("44444444D","Sonia Moran",45,39.2,11,8);
		arrayPacientes[4]=new Pacientes("55555555E","Pedro Ferrer",21,38.5,13,6);
		arrayPacientes[5]=new Pacientes("66666666F","Maria Piera",15,36.2,13,7);
		assertEquals(37.55, mainPacientes.mijaTemp(arrayPacientes),0.1);
	}
	@Test
	public void mijaTenSTest() {
		arrayPacientes[0]=new Pacientes("11111111A","Pepe Garcia",20,36.5,13,6);
		arrayPacientes[1]=new Pacientes("22222222B","Juan Santatecla",38,38.2,13.5,5.5);
		arrayPacientes[2]=new Pacientes("33333333C","Maria Peralta",25,36.7,17.5,7);
		arrayPacientes[3]=new Pacientes("44444444D","Sonia Moran",45,39.2,11,8);
		arrayPacientes[4]=new Pacientes("55555555E","Pedro Ferrer",21,38.5,13,6);
		arrayPacientes[5]=new Pacientes("66666666F","Maria Piera",15,36.2,13,7);
		assertEquals(13.5, mainPacientes.mijaTenS(arrayPacientes),0.1);
	}
	@Test
	public void mijaTenDTest() {
		arrayPacientes[0]=new Pacientes("11111111A","Pepe Garcia",20,36.5,13,6);
		arrayPacientes[1]=new Pacientes("22222222B","Juan Santatecla",38,38.2,13.5,5.5);
		arrayPacientes[2]=new Pacientes("33333333C","Maria Peralta",25,36.7,17.5,7);
		arrayPacientes[3]=new Pacientes("44444444D","Sonia Moran",45,39.2,11,8);
		arrayPacientes[4]=new Pacientes("55555555E","Pedro Ferrer",21,38.5,13,6);
		arrayPacientes[5]=new Pacientes("66666666F","Maria Piera",15,36.2,13,7);
		assertEquals(6.58, mainPacientes.mijaTenD(arrayPacientes),0.1);
	}

}
