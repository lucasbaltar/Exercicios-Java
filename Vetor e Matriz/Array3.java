package Familia51;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		int vetor[] = new int[6];
		int par=0, somapar=0, impar=0, somaimpar=0,x,numero;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0; x<6;x++)
		{
			System.out.println("Digite um número: ");
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
		
		System.out.println("\nA quantidade de números pares é de : "+par);
		System.out.println("A soma dos números pares é de: "+somapar);
		System.out.println("\nA quantidade de números ímpares é de: "+impar);
		System.out.println("A soma dos números ímpares é de: "+somaimpar);

	}

}
