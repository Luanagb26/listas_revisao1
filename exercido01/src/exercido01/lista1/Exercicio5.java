package lista1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um n�mero");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("� um n�mero par");
		}else {
			System.out.println("� um n�mero �mpar");
		}
		
		sc.close();
	}

}
