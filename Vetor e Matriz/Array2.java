package Familia51;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
	
		int matriz[][] = new int[3][3],maior10=0, linha, coluna,n;
		
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0; linha<3;linha++)
		{
			for (coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna] > 10)
				{
					maior10 += 1;
				}
				
			}
		}
		
		for (linha=0;linha <3; linha++)
		{
			System.out.println(" ");
			for (coluna=0;coluna<3; coluna++)
			{
				System.out.print(matriz[linha][coluna]+" ");
			}
		}
		System.out.println("\n\nA quantidade de números digitados que são maiores que 10 é de: "+maior10);

	}

}
