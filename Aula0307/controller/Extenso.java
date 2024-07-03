package controller;

public class Extenso {
	public Extenso() {

	}

	public String porExt(int n) {
		String sinal = "";
		if (n < 0) {
			n = n * -1;
			sinal = "menos ";
		}
		if (n < 10) {
			return sinal + unidade(n);
		} else if (n < 100) {
			return sinal + dezena(n);
		} else if (n < 1000) {
			return sinal + centena(n);
		}
		return "";
	}

	private String unidade(int n) {
		String[] unidade = { "zero", "um", "dois", "três", "quantro", "cinco", "seis", "sete", "oito", "nove" };
		return (n > 9) ? "" : unidade[n];
	}

	private String dezena(int n) {
		String[] dezena = { "dez", "onze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
				"dezenove" };
		String[] dezena2 = { "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
		int d, u;
		d = n / 10;
		u = n % 10;
		if (d == 1) {
			return dezena[u];
		} else {
			return dezena2[d - 2] + (u != 0 ? " e " + unidade(u) : "");
		}
	}

	private String centena(int n) {
		String[] centena = { "cem", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos",
				"setecentos", "oitocentos", "novecentos" };
		int c, d = 0, u = 0;
		c = n / 100;
		n = n % 100;
		if (n > 9) {
			d = n;
		} else {
			u = n;
		}
		if (c + d + u == 1)
			return centena[0];
		else {
			return centena[c] + (d != 0 ? " e " + dezena(d) : u != 0 ? " e " + unidade(u) : "");
		}
	}

}
