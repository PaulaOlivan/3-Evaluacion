//En este programa las dimensiones se han declarado como variables privadas
//El programa hecho con las variables privadas es "TrianguloPrivado"

package Herencia;

public class DimensionesPrivadas {
	private double alto; //igual a altura
	private double largo; //igual a base
	 
	//Metodo de acceso para alto y largo
	double getLargo() {return largo;}
	double getAlto() {return alto;}
	void setLargo (double b) {largo=b;}
	void setAlto (double h) {alto=h;}
	
	void mostrarDimension() {
		System.out.println("La base y la altura son respectivamente: "+largo+" y "+alto);
	}
}
