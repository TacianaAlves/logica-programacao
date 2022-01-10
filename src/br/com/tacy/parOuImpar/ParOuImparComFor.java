package br.com.tacy.parOuImpar;

public class ParOuImparComFor {
	public static void main(String[] args) {

		Integer contPar = 0; 
		Integer contImpar = 0; 	
		
		ParOuImparComFor c = new ParOuImparComFor();
		for( int i = 0; i <= 100; i++) {
			if(c.verificar(i)){
				contPar += 1; 
			}else {
				contImpar += 1;
			}
			
		}
		
		System.out.println("A quantidade de Impares são " + contImpar);
		System.out.println("A quantidade de Pares são " + contPar);
		
	}
	
	public Boolean verificar(Integer numero) {
		if(numero % 2 == 0) {			
			return true;
		}else {
			return false;
		}
	}
}

	

	

