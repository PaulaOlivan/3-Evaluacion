package Vehiculo;

public class VehiculoGeneral {
	int pasajeros; 
	int capacidad; 
	int mpg; 	 
	class TodosVehiculos{
			public void main (String[]args) {
			Vehiculo minivan = new Vehiculo();
			Vehiculo deportivo = new Vehiculo();
			int rangomini, rangodepor;
			
			minivan.pasajeros = 9;
			minivan.capacidad = 15;
			minivan.mpg = 20;
			
			deportivo.pasajeros = 2;
			deportivo.capacidad = 25;
			deportivo.mpg = 30;
			
			rangomini = minivan.capacidad * minivan.mpg;
			rangodepor = deportivo.capacidad * deportivo.mpg;
			
			System.out.println ("La minivan puede llevar " + minivan.pasajeros + " pasajeros, su deposito tiene una capacidad de ");
			System.out.println (minivan.capacidad + " litros y recorre un total de " + minivan.mpg+ " millas por litro.");
			System.out.println ("Con el deposito lleno sera capaz de recorrer un total de " + rangomini + " millas.");
			
			System.out.println ("El deportivo puede llevar " + deportivo.pasajeros + " pasajeros, su deposito tiene una capacidad de ");
			System.out.println (deportivo.capacidad + " litros y recorre un total de " + deportivo.mpg+ " millas por litro.");
			System.out.println ("Con el deposito lleno sera capaz de recorrer un total de " + rangodepor + " millas.");
			
		}
	}
	
}
