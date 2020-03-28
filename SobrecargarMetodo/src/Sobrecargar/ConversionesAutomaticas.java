//Conversiones automaticas de tipo en metodos sobrecorgados
package Sobrecargar;

class Sobrecarga2 {
	void mitipo(int x) {
		System.out.println ("Mi tipo (int): "+x);
	}
	
	void mitipo(double x) {
		System.out.println("Mi tipo (double): "+x);
	}
}

class DemoSobrecarga1{
	public static void main(String[] args) {
		Sobrecarga1 sc = new Sobrecarga1();
		
		int i = 10;
		double d = 10.1;
		
		byte b=99;
		short s=10;
		float f=11.5F;
		
		sc.mitipo(i);
		sc.mitipo(d);
		
		sc.mitipo(b); //Conversion de tipo, llamando a sc.mitipo(int)
		sc.mitipo(s); //Conversion de tipo, llamando a sc.mitipo(int)
		sc.mitipo(f); //Conversion de tipo, llamando a sc.mitipo(double)
		
	}
}
