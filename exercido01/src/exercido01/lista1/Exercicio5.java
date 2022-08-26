package lista1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("é um número par");
		}else {
			System.out.println("é um número ímpar");
		}
		
		sc.close();
	}

}
