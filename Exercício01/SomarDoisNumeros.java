package Teste;

class SomarDoisNumeros {
	
	public static void main (String[] args) {
		// inicia 3 variaveis de tipo inteiro
		int num1, num2, soma;
		// atribui valores a num1 e num2 e atribui a soma dos valores na variavel soma
		num1 = MyIO.readInt("Digite um numero: ");
		
		num2 = MyIO.readInt("Digite outro numero: ");
		
		soma = num1+num2;
		// imprime na tela o resultado da soma de num1 e num2
		System.out.println("Resultado da soma: " + soma);
		
	}
}
