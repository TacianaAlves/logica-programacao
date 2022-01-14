package br.com.tacy.heranca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private Date dataNascimento;
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		DateFormat dateFormat =  new  SimpleDateFormat( "dd/MM/yyyy" );  
        String strDate = dateFormat.format(dataNascimento);
        
		return "PessoaGenerica [nome=" + nome + ", sobreNome=" + sobreNome + ", dataNascimento=" + strDate
				+ ", endereco=" + endereco + "]";
	}

	
	
}
