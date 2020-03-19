package Alumnos;

public class Alumno3 {
	public static void main (String[]args) {
		Alumnos ManuelLopez = new Alumnos();
		float media; //usamos un float porque la media puede dar numero decimal
		
		ManuelLopez.nlista = 13;
		ManuelLopez.notadibujo = 10;
		ManuelLopez.notaingles = 8;
		ManuelLopez.notahistoria = 8;
		
		media = (ManuelLopez.notadibujo + ManuelLopez.notaingles +ManuelLopez.notahistoria) / 3;
		
		System.out.println ("Manuel Lopez es el numero " + ManuelLopez.nlista + ", su media es un " + media + ".");
	}
}
