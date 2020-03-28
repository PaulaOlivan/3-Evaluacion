//Uso del this en Java
//En este programa se usa para invocar el metodo de la clase actual
package This;

class TestInvocar {
	void display() {
		//Metodo que llama a show()
		this.show();
		System.out.println("Dentro del metodo display");
	}
	
	void show() {
		System.out.println("Dentro del metodo show \n");
	}
	
	public static void main (String[] args) {
		TestInvocar t1 = new TestInvocar();
		t1.display();
	}
}
