package lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float baseMaior;
		float baseMenor;
		float altura;
		float area;
		
		System.out.println("Insira a Base maior em cm: ");
			baseMaior = sc.nextFloat();
		System.out.println("Insira a Base menor em cm: ");
			baseMenor = sc.nextFloat();
		System.out.println("Insira Altura em cm: ");
			altura = sc.nextFloat();
			
		area = ((baseMaior+(baseMenor*altura))/2);
		
		System.out.println("A área do trapézio em cm^2 é: " + area);
		
		sc.close();
	}
	
}
