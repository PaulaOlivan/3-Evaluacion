//Codigo en Java para usar this como argumento en la llamada de un cosntructor de class A
//En objeto de class b es su miembro de datos
package This;

class A{
	B obj;
	
	//Constructor parametrizado con el objeto B como un parametro
	A(B obj){
		this.obj = obj;
		//llamamos al metodo display de class B
		obj.display();
	}
}

class B{
	int x = 5;
	
	//Constructor predeterminado que crea un objeto de A pasando this como un argumento del constructor
	B(){
		A obj = new A(this);
		System.out.println(obj);
	}
		
	//Metodo que muestra el valor de x
	void display() {
		System.out.println("Valor de x en clase B:"+x);
	}
		
	public static void main (String[] args) {
			B obj = new B();
			System.out.println(obj);
	}
}
