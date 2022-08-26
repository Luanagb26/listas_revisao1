package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1;
		long num2;
		float num3;
		
		num1 = sc.nextInt();
		num2= sc.nextLong();
		num3 = sc.nextFloat();
		
		System.out.printf("O número inteiro foi digitado: "+ num1+ "O número long foi digitado: "+num2+ "O número float foi digitado: "+num3);
		
		sc.close();
	}
}
