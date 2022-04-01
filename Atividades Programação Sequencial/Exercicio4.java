package Familia51;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números e os veja em ordem crescente");
		System.out.println("\nPrimeiro número: ");
		a = leia.nextFloat();
		
		System.out.println("\nSegundo número: ");
		b = leia.nextFloat();
		
		System.out.println("\nTerceiro número: ");
		c = leia.nextFloat();
		
		if (a>=b && a>=c && b>=c)
		{
			System.out.println("A ordem é: "+c+", "+b+", "+a);
		}
		else if (a>=b && a>=c && c>=b)
		{
			System.out.println("A ordem é: "+b+", "+c+", "+a);
		}
		else if (b>=a && b>=c && a>=c)
		{
			System.out.println("A ordem é: "+c+", "+a+", "+b);
		}
		else if (b>=a && b>=c && c>=a)
		{
			System.out.println("A ordem é: "+a+", "+c+", "+b);
		}
		else if (c>=a && c>=b && a>=b)
		{
			System.out.println("A ordem é: "+b+", "+a+", "+c);
		}
		else if (c>=a && c>=b && b>=a)
		{
			System.out.println("A ordem é: "+a+", "+b+", "+c);
		}
	}

}
