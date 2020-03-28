//Ejemplo en Java de los usos del this
//En este caso invocariamos al constructor de la clase
package This;

class TestConstructor {
	int a;
	int b;
	
	//Constructor predeterminado
	TestConstructor(){
		this(10, 20);
		System.out.println ("Dentro del constructor predeterminado \n");
	}
	
	//Constructor parametrizado??
	TestConstructor(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Dentro del cosntructor parametrizado");
	}
	
	public static void main(String[] args) {
		TestConstructor object = new TestConstructor();
		System.out.println(object);
	}
}
