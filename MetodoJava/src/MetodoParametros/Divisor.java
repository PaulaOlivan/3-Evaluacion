package MetodoParametros;

public class Divisor {
	//devuelve true si x es par
	boolean esDivisor (int a, int b) {
		if ((b%a)==0) return true;
		else return false;
	}
}

class DivisorDemo{
	public static void main(String[] args) {
        Divisor x =new Divisor();
        if (x.esDivisor(2,20)) System.out.println("2 es Divisor de 20");
        if (x.esDivisor(3,20)) System.out.println("3 es Divisor de 20");
    }
}
