package Familia51;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros e os veja em ordem crescente");
		System.out.println("\nPrimeiro n�mero: ");
		a = leia.nextFloat();
		
		System.out.println("\nSegundo n�mero: ");
		b = leia.nextFloat();
		
		System.out.println("\nTerceiro n�mero: ");
		c = leia.nextFloat();
		
		if (a>=b && a>=c && b>=c)
		{
			System.out.println("A ordem �: "+c+", "+b+", "+a);
		}
		else if (a>=b && a>=c && c>=b)
		{
			System.out.println("A ordem �: "+b+", "+c+", "+a);
		}
		else if (b>=a && b>=c && a>=c)
		{
			System.out.println("A ordem �: "+c+", "+a+", "+b);
		}
		else if (b>=a && b>=c && c>=a)
		{
			System.out.println("A ordem �: "+a+", "+c+", "+b);
		}
		else if (c>=a && c>=b && a>=b)
		{
			System.out.println("A ordem �: "+b+", "+a+", "+c);
		}
		else if (c>=a && c>=b && b>=a)
		{
			System.out.println("A ordem �: "+a+", "+b+", "+c);
		}
	}

}
