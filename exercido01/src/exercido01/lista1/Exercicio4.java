package lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Insira o primeiro n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println(num1+" � o maior");
		}else {
			System.out.println(num2+" � o maior");
		}
		
		sc.close();
	}

}
