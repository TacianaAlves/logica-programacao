package br.com.tacy.media;

public class Media {

	public static void main(String[] args) {
		Media m = new Media();
		Double n1 = 8.5;
		Double n2 = 7.0;
		Double n3 = 7.3;
		Double n4 = 3.9;
		Double total = n1 + n2 + n3 + n4;
		Integer qtd = 4;
		
		Double media = m.calcularMedia(total, qtd);
		System.out.println("A média é : "+ media);	
		
	}
	
	public Double calcularMedia(Double valorTotal, Integer qtd) {
		Double media = valorTotal / qtd;
		return media;
		
	} 

	
}
