package Vehiculo;

public class Referencias {
	public static void main(String[] args) {
		Vehiculo auto1 = new Vehiculo();
		Vehiculo auto2 =auto1;
		
		auto1.mpg = 28;
		
		System.out.println("El auto 1 recorre " + auto1.mpg + " millas por litro");
		System.out.println("El auto 2 recorre " + auto2.mpg + " millas por litro");
	}
}
