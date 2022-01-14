package br.com.tacy.arrays;

public class TesteArrayVetor {

	public static void main(String[] args) {
	
		/*Criação do aluno*/
	Aluno aluno = new Aluno();
	aluno.setNome("Tacy");
	aluno.setNomeEscola("Unip");
	
	double[] notas = {8.8, 9.7 ,7.6, 6.8};
	double[] notasJava = {10, 9.2 ,8.9, 7.8};
	
	/*Criação da disciplina*/
	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Análise e desenvolvimento de sistemas");
	disciplina.setNota(notas);
	
	aluno.getDisciplinas().add(disciplina);	
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Curso de Java");
	disciplina2.setNota(notasJava);
	
	aluno.getDisciplinas().add(disciplina2);	
	
	/*percorrendo a lista disciplina */
	
	System.out.println("Nome do aluno = " + aluno.getNome() + " Inscrito no curso : " + aluno.getNomeEscola());
	System.out.println("================Diciplina do aluno=============== ");
	for(Disciplina d : aluno.getDisciplinas()) {
		
		System.out.println("Disciplina : " + d.getDisciplina());
		System.out.println("A notas da disciplina sâo: ");
		
		for(int pos = 0; pos < d.getNota().length; pos++) {
			System.out.println("Nota" + pos + " é igual = " + d.getNota()[pos]);
			
		}
		
	}
	
	}
	
}
