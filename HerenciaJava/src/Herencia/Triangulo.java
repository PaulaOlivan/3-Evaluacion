//Nota: si declaramos las variables del triangulo provadas el programa dejara de tener acceso a ellas.


package Herencia;

public class Triangulo extends DosDimensiones{
	String estilo;
	
	double area() {
		return base*altura/2;
	}
	
	void mostrarEstilo() {
		System.out.println("El triangulo es: "+estilo);
	}
}

class Lados3{
	public static void min (String[] args) {
		Triangulo t1=new Triangulo();
		Triangulo t2=new Triangulo();
		
		t1.base=4.0;
		t1.altura=4.0;
		t1.estilo="Estilo 1";
		
		t2.base=8.0;
		t2.altura=12.0;
		t2.estilo="Estilo 2";
			
		System.out.println("Información para T!: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: "+t1.area());
		
		System.out.println();
		
		System.out.println("Informacion para T2");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: "+t2.area());
	}
}
