package Familia51;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números e descubra qual é o maior entre eles: ");
		System.out.println("\nPrimeiro número: ");
		a = leia.nextInt();
		
		System.out.println("\nSegundo número: ");
		b = leia.nextInt();
		
		System.out.println("\nTerceiro número: ");
		c = leia.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("O número "+a+" é o maior entre eles");
		}
		else if (b>a && b>c)
		{
			System.out.println("O número "+b+" é o maior entre eles");
		}
		
		else if (c>a && c>b)
		{
			System.out.println("O número "+c+" é o maior entre eles");
		}
	}

}
