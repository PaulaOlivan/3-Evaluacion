package Vehiculo;

public class VehiculoDos {
	 public static void main (String[]args) {
		 Vehiculo deportivo = new Vehiculo();
		 int rango;
		 //caracteristicas del deportivo
		 deportivo.pasajeros = 2;
		 deportivo.capacidad = 25;
		 deportivo.mpg = 30;
		 rango = deportivo.capacidad * deportivo.mpg;
		 System.out.println ("El deportivo puede llevar " + deportivo.pasajeros + " pasajeros, su deposito tiene una capacidad de ");
		 System.out.println (deportivo.capacidad + " litros y recorre un total de " + deportivo.mpg+ " millas por litro.");
		 System.out.println ("Con el deposito lleno sera capaz de recorrer un total de " + rango + " millas.");
	 }

}
