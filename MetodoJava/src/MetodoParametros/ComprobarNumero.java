package MetodoParametros;

public class ComprobarNumero {
	//Devolvera true si n es par
	boolean esPar (int x) {
		if ((x%2)==0) return true;
		else return false;
	}
}

class ParametroDemo{
	public static void main (String[] args) {
		ComprobarNumero e = new ComprobarNumero();
		
		if (e.esPar(10)) System.out.println("10 es par.");
		if (e.esPar(9)) System.out.println("9 es par.");
		if (e.esPar(8)) System.out.println("8 es par."); 
	}
}
