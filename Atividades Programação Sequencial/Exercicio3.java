package Familia51;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros e descubra qual � o maior entre eles: ");
		System.out.println("\nPrimeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("\nSegundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("\nTerceiro n�mero: ");
		c = leia.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("O n�mero "+a+" � o maior entre eles");
		}
		else if (b>a && b>c)
		{
			System.out.println("O n�mero "+b+" � o maior entre eles");
		}
		
		else if (c>a && c>b)
		{
			System.out.println("O n�mero "+c+" � o maior entre eles");
		}
	}

}
