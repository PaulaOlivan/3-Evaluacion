//Uso del this en Java, ejemplo 1
//Este programa sirve para referirnos a las variables de instancia de la clase actual???
package This;

public class Test {
	int a;
	int b;
	
	//Constructor parametrizado??
	Test (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void display() {
		//Visualización del valor de las varibles a y b
		System.out.println("a="+a+" b="+b);
	}
	public static void main (String[] args) {
		Test object = new Test(10, 20);
		object.display();
	}
}
