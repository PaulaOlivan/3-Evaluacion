//Programa de demostracion de sobrecarga de metodo
package Sobrecargar;

public class Sobrecarga1 {
	void demoSobrec() {
		System.out.println("Sin parametros\n");
	}
	
	//Sobrecargando demoSobrec para un parametro int
	void demoSobrec (int a) {
		System.out.println("Un parametro: "+a+"\n");
	}
	
	//Sobrecargando demoSobrec para dos parametros int
	int demoSobrec (int a, int b) {
		System.out.println("Dos parametros: "+a+", "+b);
		return a+b;
	}
	
	//Sobrecargando demoSobrec para dos parametros double
	double demoSobrec(double a, double b) {
		System.out.println ("Dos parametros de tipo double: "+a+", "+b);
		return a+b;
	}
}

class DemoSobrecarga{
	public static void main (String[] args) {
		Sobrecarga1 sc = new Sobrecarga1();
		int sumaint;
		double sumadouble;
		
		//Llamando todas las versiones de demoSobrec
		sc.demoSobrec();
		sc.demoSobrec(2);
		
		sumaint=sc.demoSobrec(4, 6);
		System.out.println("Resultado de demoSobrec (4, 6) es: "+sumaint+"\n");
		
		sumadouble=sc.demoSobrec(1.1,2.2);
		System.out.println("Resultado de demoSobrec(1.1, 2.2) es: "+sumadouble);
	}
}
