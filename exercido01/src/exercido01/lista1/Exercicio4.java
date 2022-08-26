package lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Insira o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" é o maior");
		}else {
			System.out.println(num2+" é o maior");
		}
		
		sc.close();
	}

}
