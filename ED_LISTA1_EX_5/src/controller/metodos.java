package controller;

public class metodos {
	public metodos() {
		super();
	}
		 public double somatoria(int n) {

	        // CONDIÇÃO DE PARADA:
	        // Quando n for menor ou igual a 1,
	        // a somatória termina, pois:
	        // S(1) = 1
	        if (n <= 1) {
	            return 1.0;
	        }

	        // RELAÇÃO RECURSIVA:
	        // S(n) = 1/n + S(n-1)
	  
	        return (1 / (double) n) + somatoria(n - 1);
	    }
	
	
}