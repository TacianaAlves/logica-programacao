package br.com.tacy.parOuImpar;

public class ParOuImpar {

	public static void main(String[] args) {

		Integer num = 20;
		
		if(num % 2 == 0 ) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � impar");
		}
		
		Integer num2 = 35;
		
		if(num2 % 2 == 0 ) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � impar");
		}
		
		System.out.println("Usando orienta��o objeto conseguimos reusar.");
		
		ParOuImpar pi = new ParOuImpar();
		pi.verifiacar(num);
		pi.verifiacar(num2);
		
	}
	
	public void verifiacar(Integer numero ) {

		if(numero % 2 == 0 ) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � impar");
		}
	}

}
