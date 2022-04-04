
//Descubra quantos números entre 1000 e 1999 que quando divididos por 11, possuem resto 5.

package Familia51;

public class NumerosPor5 {

	public static void main(String[] args) {

		int x,contNumeros = 0;
		
		for (x = 1000; x <= 1999; x++)
		{
			if (x % 11 == 5)
			{
				contNumeros += 1;
				System.out.println("O número "+x+" divido por 11 possui resto 5.");
			}
		}
		
		System.out.println("\nA quantidade de números que dividido por 11 possui resto 5 é de: "+contNumeros);

	}

}
