package br.com.tacy.heranca;

public class PessoaJuridica extends Pessoa {

	private Long CNPJ;


	public Long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}
	@Override
	public String toString() {
		
		return super.toString() + " PessoaJuridica [CNPJ=" + CNPJ + "]";
	}
	


	
}
