package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0]= new Empleado("Rodolfo", 5000, 2014, 1, 13);

		misEmpleados[1]= new Empleado("Pedro", 85000, 2010, 5, 2);
		misEmpleados[2] = new Empleado("Jorge", 80000, 1997, 3, 28);
		
	
		//Uso de ciclo FOR MEJORADO 
		
		for(Empleado e:misEmpleados){
			e.AumentaSueldo(5);
		}
		for (Empleado e: misEmpleados){
			System.out.println("Nombre : " +e.dimeNombre() + "\nSueldo: "+ e.dimeSueldo()
			+ " \nFecha: " + e.dimeFechaContrato());
		}
		
	}

}

class Empleado {
	public Empleado(String Nom, double sue, int annio, int mes, int dia) {
		nombre = Nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(annio, mes - 1, dia);
		altaContrato = calendario.getTime();

	}

	public String dimeNombre() { // GETTER
		return nombre;
	}

	public double dimeSueldo() { // GETTER
		return sueldo;
	}

	public Date dimeFechaContrato() { // GETTER
		return altaContrato;
	}

	public void AumentaSueldo(double porcentaje) { // SETTER
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
