package Vehiculo;

public class Vehiculo {
	
	int pasajeros; 
	int capacidad; 
	int mpg; 
	void rango() {
		System.out.println("Con rango de "+ capacidad*mpg);
	}
}

class MetodoAdicional{
	public static void main (String[] args) {
		Vehiculo minivan = new Vehiculo();
		Vehiculo depor = new Vehiculo();

		minivan.pasajeros=9;
		minivan.capacidad=25;
		minivan.mpg=20;
		
		depor.pasajeros=2;
		depor.capacidad=25;
		depor.mpg=30;
		
		System.out.print("La minivan puede llevar " +minivan.pasajeros +". ");
	    minivan.rango();
	    
	    System.out.print("El deportivo puede llevar " +depor.pasajeros +". ");
        depor.rango();
	}
}
	
