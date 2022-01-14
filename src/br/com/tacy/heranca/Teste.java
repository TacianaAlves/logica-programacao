package br.com.tacy.heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {

		PessoaJuridica j = new PessoaJuridica();
		j.setNome("Bruno");
		j.setSobreNome("Batista");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				
		try {
			Date dataFormatada = formato.parse("20/01/2000");		
			j.setDataNascimento(dataFormatada);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		j.setEndereco("Rua Java");
		j.setCNPJ(123456777L);

		System.out.println(j);

		PessoaFisica f = new PessoaFisica();
		f.setNome("Ana");
		f.setSobreNome("Bona");
		f.setDataNascimento(new Date(30 / 02 / 2019));
		f.setEndereco("Barueri");
		f.setCPF(60587654434L);
		System.out.println(f);
				 
		 
	}

}
