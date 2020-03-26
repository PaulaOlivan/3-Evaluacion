package Clase;

class ClaseMia{
	int x;
	ClaseMia(int i){
		x=i;
	}
			
}

class ConstructorDemo{
	public static void main(String[] args) {
		ClaseMia t1 = new ClaseMia(15);
		ClaseMia t2 = new ClaseMia(28);
		
		System.out.println(t1.x+" - "+t2.x);
	}
}