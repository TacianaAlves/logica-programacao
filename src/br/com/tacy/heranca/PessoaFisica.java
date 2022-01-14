package br.com.tacy.heranca;

public class PessoaFisica extends Pessoa {

	private Long CPF;

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return super.toString() + " PessoaFisica [CPF=" + CPF + "]";
	}

}
