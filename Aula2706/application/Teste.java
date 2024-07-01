package application;

public class Teste {

	public static void main(String[] args) {
		int idade = 18;
		String resposta;
		//maior ou menor de idade, duas formas
		/*if (idade < 18) {
			resposta = "Você é menor de idade!"; // condição composta
		}
		else {
			resposta = "Você é maior de idade!";
		}*/
		resposta = idade<18?"Maior de idade!" : "Menor de idae!"; // expressão condicional ternária
		System.out.println(resposta);
		
		//situação das notas
		int nota = 60, f = 10;
		String situacao;
		situacao = nota<40 && f <15?"Reprovado!":nota<60?"Recuperação!":"Aprovado!";
		System.out.println(situacao);
		// && = e = end
		// || = ou = or
		// ! = não = not
	}
}
