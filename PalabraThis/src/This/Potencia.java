package This;

public class Potencia {
	double b;
	int e;
	double valor;
	
	Potencia (double base, int exp){
		b=base;
		e=exp;
		valor=1;
		
		if (exp==0) return;
		for (; exp>0;exp--) valor=valor*base;
	}
	
	double get_potencia() {
		return valor;
	}
}	

class DemoPotencia{
	public static void main (String[] args) {
		
		Potencia x = new Potencia (4.0,2);
		Potencia y = new Potencia (2.5,1);
		Potencia z = new Potencia (2.7,2);
		
		System.out.println(x.b+ " elevado a la potencia de "+ x.e+", es igual a: "+x.get_potencia());
        System.out.println(y.b+ " elevado a la potencia de "+ y.e+", es igual a: "+y.get_potencia());
        System.out.println(z.b+ " elevado a la potencia de "+ z.e+", es igual a: "+z.get_potencia());
	}
}
