package Alumnos;

public class Alumno2 {
	public static void main (String[]args) {
		Alumnos AndreaAlonso = new Alumnos();
		float media; //usamos un float porque la media puede dar numero decimal
		
		AndreaAlonso.nlista = 1;
		AndreaAlonso.notadibujo = 9;
		AndreaAlonso.notaingles = 7;
		AndreaAlonso.notahistoria = 9;
		
		media = (AndreaAlonso.notadibujo + AndreaAlonso.notaingles +AndreaAlonso.notahistoria) / 3;
		
		System.out.println ("Andrea Alonso es el numero " + AndreaAlonso.nlista + ", su media es un " + media + ".");
	}
}
