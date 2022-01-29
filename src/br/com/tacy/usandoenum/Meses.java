package br.com.tacy.usandoenum;

public enum Meses {

	JANEIRO(1, "Janeiro"), FEVEREIRO(2, "Fevereiro"), MARCO(3, "Março"), ABRIL(4, "Abril"), MAIO(5, "Maio"),
	JUNHO(6, "Junho"), JULHO(7, "Julho"), AGOSTO(8, "Agosto"), SETEMBRO(9, "Setembro"), OUTUBRO(10, "Outubro"),
	NOVEMBRO(11, "Novembro"), DEZEMBRO(12, "Dezembro");

	private String valor;
	private int num;

	Meses(int num, String valor) {
		this.valor = valor;
		this.num = num;
	}

	public static Meses get(int num) {
		switch (num) {
		case 1:
			return JANEIRO;
		case 2:
			return FEVEREIRO;
		case 3:
			return MARCO;
		case 4:
			return ABRIL;
		case 5:
			return MAIO;
		case 6:
			return JUNHO;
		case 7:
			return JULHO;
		case 8:
			return AGOSTO;
		case 9:
			return SETEMBRO;
		case 10:
			return OUTUBRO;
		case 11:
			return NOVEMBRO;
		case 12:
			return DEZEMBRO;
		default:
			throw new IllegalArgumentException("Não existe o mês selecionado!");
		}
	}

	public String getValor() {
		return valor;
	}

}
