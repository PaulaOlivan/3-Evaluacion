package Alumnos;

public class Alumno1 {
	public static void main (String[]args) {
		Alumnos JuanPerez = new Alumnos();
		float media; //usamos un float porque la media puede dar numero decimal
		
		JuanPerez.nlista = 20;
		JuanPerez.notadibujo = 8;
		JuanPerez.notaingles = 7;
		JuanPerez.notahistoria = 6;
		
		media = (JuanPerez.notadibujo + JuanPerez.notaingles + JuanPerez.notahistoria) / 3;
		
		System.out.println ("Juan Perez es el numero " + JuanPerez.nlista + ", su media es un " + media + ".");
	}
}
