package br.com.tacy.usandoenum;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero do m�s:");
		int numero = 0;
		try {
			 numero = entrada.nextInt();
			
		} catch (Exception e) {
			System.out.println("Digite apenas n�meros!");			
		} finally{
			entrada.close();
		}
		if(numero != 0) {
			String mes = Meses.get(numero).getValor();		
			System.out.println("O m�s escolhido �: "+ mes);			
		}
	}

}
