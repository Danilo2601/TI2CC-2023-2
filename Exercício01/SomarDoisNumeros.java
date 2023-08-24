package Teste;

class SomarDoisNumeros {
	
	public static void main (String[] args) {
		int num1, num2, soma;
		
		num1 = MyIO.readInt("Digite um numero: ");
		
		num2 = MyIO.readInt("Digite outro numero: ");
		
		soma = num1+num2;
		
		System.out.println("Resultado da soma: " + soma);
		
	}
}
