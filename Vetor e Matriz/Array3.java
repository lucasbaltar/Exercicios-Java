package Familia51;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		int vetor[] = new int[6];
		int par=0, somapar=0, impar=0, somaimpar=0,x,numero;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0; x<6;x++)
		{
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero != 0)
			{
				if (numero % 2 == 0)
				{
					par += 1;
					somapar += numero;
				}
				else
				{
					impar +=1;
					somaimpar += numero;
				}
			}
			
		}
		
		System.out.println("\nA quantidade de n�meros pares � de : "+par);
		System.out.println("A soma dos n�meros pares � de: "+somapar);
		System.out.println("\nA quantidade de n�meros �mpares � de: "+impar);
		System.out.println("A soma dos n�meros �mpares � de: "+somaimpar);

	}

}
