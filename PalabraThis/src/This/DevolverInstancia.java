//Este programa es uno de los ejemplos que this tiene dentro de Java
//En este caso devuelve la instancia?? de la clase actual
package This;

class TestInstancia {
	int a;
	int b;
	
	//Constructor predeterminado ??de clase??
	TestInstancia(){
		a = 10;
		b = 20;
	}
	
	//Metodo que devuelve la instancia de la clase actula
	TestInstancia get() {
		return this;
	}
	
	//Visualizacion del valor de las variables a y b
	void display() {
		System.out.println("a="+a+", b="+b);
	}
	
	public static void main (String[] args){
		TestInstancia object = new TestInstancia();
		object.get().display();
	}
	
}
