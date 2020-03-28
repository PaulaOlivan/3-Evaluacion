//Ejemplo en Java del uso del this
//En este caso, this sirve como parametro de metodo
package This;

class TestMetodo {
	int a;
	int b;
	
	//Cosntructor predeterminado
	TestMetodo(){
		a = 10;
		b = 20;
	}
	
	//Metodo que recibe el this como parametro
	void display(TestMetodo obj) {
		System.out.println("a = "+a+"\nb = "+b);
	}
	
	//Metodo que devuelve la instancia de la clase
	void get() {
		display(this);
	}
	
	public static void main(String[] args) {
		TestMetodo object = new TestMetodo();
		object.get();
	}
}
