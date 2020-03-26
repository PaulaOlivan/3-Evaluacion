package Clase;

class Vehiculo {
	int pasajeros;
	int capacidad;
	int mpg;
	
	Vehiculo (int p, int c, int m){ //Definimos el constructor de Vehiculo
		pasajeros=p;
		capacidad=c;
		mpg=m;
	}
	int rango() {
		return mpg*capacidad;
	}
	double capacidadnueva(int miles) {
		return (double)miles/mpg;
	}
}

class DemoVehiculo{
	public static void main (String[] args) {
		Vehiculo minivan = new Vehiculo(9,15,20);
		Vehiculo depor = new Vehiculo(2,25,30);
		
		double galones;
		int distancia = 250;
		galones=minivan.capacidadnueva(distancia);
		System.out.println("Para ir a "+distancia+" en minivan, se necesitan"+galones+" galones.");
		
		galones=depor.capacidadnueva(distancia);
		System.out.println("Para ir a "+distancia+" en deportivo, se necesitan"+galones+" galones.");
	}
}
