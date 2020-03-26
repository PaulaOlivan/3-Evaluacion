//Los constructores realizan una funcion similar a la de las clases pero de una forma que evita los errores
//Con los constructores se evita que puedas olvidarte de olvidar uno de los campos de la clase
package Clase;

public class MiClase {
	int x;
	MiClase(){ //El constructor lleva el mismo nombre que la clase y sera similar a la sintaxis del metodo
		x=10;
	}//En las clases sin constructores, Java proporciona un constructor predeterminado,
	 //Si definimos nuestro propio constructor, este predeterminado ya no se usa.
}

class Democosntructor{
	public static void main (String[] args) {
		MiClase t1 = new MiClase();
		MiClase t2 = new MiClase();
		
		System.out.println(t1.x+" - "+t2.x);
	}
}