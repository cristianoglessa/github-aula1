package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor para somar: ");
		double valor1 = sc.nextDouble();
		System.out.print("Digite o segundo valor para somar: ");
		double valor2 = sc.nextDouble();
		double soma = valor1 + valor2;
		
		if (valor1 % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}
		
		System.out.println("Calculando...");
		System.out.println();
		System.out.println("O primeiro valor que voce digitou foi: " + valor1);
		System.out.println("O Segundo valor que voce digitou foi: " + valor2);
		System.out.printf("A soma dos dois valores é: %.2f", soma);
		
		sc.close();
	}
}
