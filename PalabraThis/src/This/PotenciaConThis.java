package This;

public class PotenciaConThis {
	double b;
	int e;
	double valor;
	
	PotenciaConThis (double base, int exp){
		this.b=base;
		this.e=exp;
		this.valor=1;
		
		if (exp==0)return;
		for (;exp>0;exp--) this.valor=this.valor*base;
	}
	
	double get_potencia() {
		return this.valor;
	}
}
