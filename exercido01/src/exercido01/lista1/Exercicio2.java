package lista1;

import java.util.Scanner;


public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float peso;
		float altura ;
		float resultado;
		
		peso = sc.nextFloat();
		altura = sc.nextFloat();
		resultado = (peso/altura*altura);
		
	System.out.printf("O valor do seu IMC é:"+ resultado);
	sc.close();
	
	}
	

}
