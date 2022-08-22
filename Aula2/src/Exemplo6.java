//Declaração de variáveis
public class Exemplo6 {

	public static void main(String[] args) {
		//Declaração de múltiplas variáveis
		int x = 1, y = 2, z = 3, w = 4;
		System.out.println(x + y + z + w);
		
		//Exemplo
		int notaA2 = 4;
		int notaA1 = 3;
		int notaFinal = notaA2 + notaA1;
		System.out.println("NF: " + notaFinal);
		
		notaA2 = 5;
		notaA1 = 5;
		int notaFinal2 = notaA2 + notaA1;
		System.out.println("NF: " + notaFinal2);
		
		//Variáveis finais são imutáveis
		//Somente para leitura
		final int ano = 2022;
		
		final String seg = "Segunda-feira";
		final String mes = "Agosto";
	}

}
