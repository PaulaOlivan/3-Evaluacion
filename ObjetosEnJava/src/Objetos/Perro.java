package Objetos;

public class Perro {
	
	//Variables para las caracteristicas del perro
	String nombre;
	String raza;
	int edad;
	String color;
	
	
	//Declaracion del constructor de clases
	public Perro (String nombre, String raza, int edad, String color)
	{
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}
	
	//Metodo 1
	public String getNombre () {
		return nombre;
	}
	//Metodo 2
	public String getRaza() {
		return raza;
	}
	//Metodo 3
	public int getEdad() {
		return edad;
	}
	//Metodo 4
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return ("Hola mi nombre es "+this.getNombre()+". Soy un/a " +this.getRaza()+", tengo "+this.getEdad()+" años y soy de color "+this.getColor()+".");	
	}
	public static void main(String[] args) {
		Perro Wendy = new Perro ("Wendy", "perro de aguas", 4, "negro y blanco");
		System.out.println(Wendy.toString());
	}

}
