package lista04a;

import java.util.ArrayList;

import java.util.Collections;

public class Principal2 {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("123", "Ana");
		
		Paciente p2 = new Paciente("456", "Zelia");
		
		Paciente p3 = new Paciente("65", "João");
		
		Paciente p4 = new Paciente("789", "Bruna");
		
	ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	pacientes.add(p1);
	pacientes.add(p2);
	pacientes.add(p3);
	pacientes.add(p4);
	Collections.sort(pacientes);
	
	//Collections.sort(pacientes, new ComparadorPorCodigo());
	
	System.out.println(pacientes);
	}
}
