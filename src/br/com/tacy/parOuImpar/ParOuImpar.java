package br.com.tacy.parOuImpar;

public class ParOuImpar {

	public static void main(String[] args) {

		Integer num = 20;
		
		if(num % 2 == 0 ) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
		
		Integer num2 = 35;
		
		if(num2 % 2 == 0 ) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
		
		System.out.println("Usando orientação objeto conseguimos reusar.");
		
		ParOuImpar pi = new ParOuImpar();
		pi.verifiacar(num);
		pi.verifiacar(num2);
		
	}
	
	public void verifiacar(Integer numero ) {

		if(numero % 2 == 0 ) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
	}

}
