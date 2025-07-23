package estudos;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class ExVetorAula04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de preço médio");

		System.out.print("Faremos a média de preço de quantos produtos? ");
		int n = sc.nextInt();

		Vetor[] vect = new Vetor[n];
		System.out.println();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do "+ (i + 1) +"° produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Vetor(name, price);
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		
		double mediaPreco = soma / n;
		
		System.out.println("A média de preços desses produtos é: " + mediaPreco);
		sc.close();
	}
}
