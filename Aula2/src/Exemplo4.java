//Tipos de dados Primitivos
public class Exemplo4 {
	public static void main(String[] args) {
		//Byte | Tamanho 1 Byte
		//Armazenar números inteiros de -128 a 127
		byte numero = 127;
		
		//short | Tamanho 2 Byte
		//Armazena números inteiros de -32.768 a 32.767
		short numero2 = 32767;

		//int | Tamanho 4 Byte
		//Armazena números inteiros de -2.147.483.648 a 2.147.483.648
		int numero3 = 2147483647;
		
		//Long | Tamanho 8 Byte
		//Armazena números inteiros de -9.223.372.036.854.775.807 a 9.223.372.036.854.775.807;
		long numero4 = 9223372;
		
		//Float | 4 bytes
		//Armazena números fracionários
		//Suficiente para números com 6 a 7 dígitos decimais
		float numero5 =40.60f;
		
		//Double | 8 bytes
		//Armazena números fracionários
		//15 dígitos decimais
		double numero6 = 50.6060d;
		
		//Boolean | 1 bit
		//Verdadeiro ou Falso
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Char | 2 bytes
		//caracteres/letras ou valores ASCII
		char letra = 'A';
		
		System.out.println("byte: " + numero);
		System.out.println("short " + numero2);
		System.out.println("int: " + numero3);
		System.out.println("long: " + numero4);
		System.out.println("float: " + numero5);
		System.out.println("double: " + numero6);
		System.out.println("boolean: " + verdadeiro);
		System.out.println("boolean: " + falso);
		System.out.println("char: " + letra);
	}
}
