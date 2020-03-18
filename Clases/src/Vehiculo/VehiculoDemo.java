package Vehiculo;

public class VehiculoDemo {
 public static void main (String[]args) {
	 //para relacionar el vehiculo con sus caracteristicas 
	 //la estructura es objeto.miembro el objeto es el vehiculo y el miembro las caracteristicas
	 //Ej: tren.pasajeros
	 Vehiculo minivan = new Vehiculo();
	 int rango; //millas que recorrera con el tanque lleno
	 
	 //caracteristicas de minivan
	 minivan.pasajeros = 9;
	 minivan.capacidad = 15;
	 minivan.mpg = 20;
	 
	rango = minivan.capacidad * minivan.mpg;
	System.out.println ("La minivan puede llevar " + minivan.pasajeros + " pasajeros, su deposito tiene una capacidad de ");
	System.out.println (minivan.capacidad + " litros y recorre un total de " + minivan.mpg+ " millas por litro.");
	System.out.println ("Con el deposito lleno sera capaz de recorrer un total de " + rango + " millas.");
 }
}
