package Teste;
import java.util.Scanner;

class SomarDoisNumeros {
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
		int num1, num2, soma;
		
		System.out.println("Digite um numero: ");
		num1 = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = scanner.nextInt();
		
		soma = num1+num2;
		
		System.out.println("Resultado da soma: " + soma);
		
	}
}
