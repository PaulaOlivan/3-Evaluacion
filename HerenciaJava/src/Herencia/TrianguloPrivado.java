//En este programa se usan los datos de "DimensionesPrivadas" para mostrar las caracteristicas del triangulo

package Herencia;

public class TrianguloPrivado extends DimensionesPrivadas{
	String estilo;
	
	double area() {
		return getLargo()*getAlto()/2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: "+estilo);
	}
}

class Lados{
	public static void min(String[] args) {
		TrianguloPrivado t1=new TrianguloPrivado();
		TrianguloPrivado t2=new TrianguloPrivado();
		
		t1.setLargo(4.0);
		t1.setAlto(4.0);
		t1.estilo="Estilo 1";
		
		t2.setLargo(8.0);
		t2.setAlto(12.0);
		t2.estilo="Estilo 2";
		
		System.out.println("Informacion sobre t1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: "+t1.area());
		
		System.out.println("Informacion sobre t2: ");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: "+t2.area());
		
	}
}
