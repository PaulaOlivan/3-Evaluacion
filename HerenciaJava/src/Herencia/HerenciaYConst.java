//En este programa se mezcla el uso de constructores con la herencia

package Herencia;

class Triangulo2 extends DimensionesPrivadas{
	String estilo;
	
	//Constructor
	Triangulo2(String s, double b, double h){
		setLargo(b);
		setAlto(h);
		estilo=s;
	}
	
	double area() {
		return getLargo()*getAlto()/2;
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es estilo: ");
	}
}

class InfoTriangulo{
	public static void main (String[] args) {
		Triangulo2 t1=new Triangulo2("Estilo 1",4.0,4.0);
		Triangulo2 t2=new Triangulo2("Estilo 2",8.0,12.0);
		
		System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());
	}
}
