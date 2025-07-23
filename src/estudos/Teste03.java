package estudos;

import java.util.Scanner;

public class Teste03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(" ========== Calculadora de Média de peso ==========%n%n");
		System.out.printf("A media calculada será de quantas pessoas? ");
		int n = sc.nextInt();
		int totPessoas = 0;
		System.out.println();
		double[] vetor = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Digito o peso da " + (i + 1) + "° pessoa: ");
			vetor[i] = sc.nextDouble();
			totPessoas += 1;
		}
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		double mediaPeso = soma / n;
		System.out.println();
		System.out.printf("A media de peso das %d pessoas é: %.3fkg", totPessoas, mediaPeso);
		
		
		sc.close();

	}

}
