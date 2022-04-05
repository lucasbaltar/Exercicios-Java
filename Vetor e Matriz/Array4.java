package Familia51;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		String certeza;
		double matriz1[][] = new double[2][2], matriz2[][] = new double [2][2], matriz3[][] = new double [2][2];
		double matriz4[][] = new double[2][2];
		int x,y,numero, constante;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<2; x++)
		{
			for(y=0;y<2;y++)
			{
				System.out.println("Digite um número: ");
				matriz1[x][y] = leia.nextDouble();
				matriz3[x][y] = matriz1[x][y];
				matriz4[x][y] = matriz1[x][y];
			}
		}
		
		for(x=0; x<2; x++)
		{
			for(y=0;y<2;y++)
			{
				System.out.println("Digite um número: ");
				matriz2[x][y] = leia.nextDouble();
				matriz3[x][y] += matriz2[x][y];
				matriz4[x][y] -= matriz2[x][y];
			}
		}
		
		
		for(x=0; x<2; x++)
		{
			System.out.println("\n");
			for(y=0;y<2;y++)
			{
				System.out.print(" "+matriz3[x][y]);
			}
		}
		
		for(x=0; x<2; x++)
		{
			System.out.println("\n");
			for(y=0;y<2;y++)
			{
				System.out.print(" "+matriz4[x][y]);
			}
		}
		
		
		
		
		System.out.println("\n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda"
				+ "\n3 - Adicionar uma constante as duas matrizes\n4 - Imprimir as matrizes");
		System.out.println("\nQual operação você deseja realizar? ");
		numero = leia.nextInt();
		
		while (numero<1 || numero>4)
		{
			System.out.println("\n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda"
					+ "\n3 - Adicionar uma constante as duas matrizes\n4 - Imprimir as matrizes");
			System.out.println("\nDigite novamente a operação a ser realizada: ");
			numero = leia.nextInt();
		}
		
		switch (numero)
		{
		case (1):
			
			System.out.println("1 - Somar as duas matrizes: ");
			for(x=0; x<2; x++)
			{
				System.out.println("\n");
				for(y=0;y<2;y++)
				{
					System.out.print(" "+matriz3[x][y]);
				}
			}
			break;
		
		case (2):
			
			System.out.println("2 - Subtrair a primeira matriz da segunda: ");
			for(x=0; x<2; x++)
			{
				System.out.println("\n");
				for(y=0;y<2;y++)
				{
					System.out.print(" "+matriz4[x][y]);
				}
			}
			break;
		
		case (3): 
			
			System.out.println("3 - Adicionar uma constante as duas matrizes: ");
			System.out.println("Digite a constante a ser adicionada: ");
			constante = leia.nextInt();
			matriz1[0][0] = matriz2[0][0] = constante;
			break;
		
		case (4):
			
			System.out.println("4 - Imprimir as matrizes");
			
			for(x=0; x<2; x++)
			{
				System.out.println("\n");
				for(y=0;y<2;y++)
				{
					System.out.print(" "+matriz1[x][y]);
				}
			}
			System.out.println("");
			for(x=0; x<2; x++)
			{
				System.out.println("\n");
				for(y=0;y<2;y++)
				{
					System.out.print(" "+matriz2[x][y]);
				}
			}
			break;
		}
		
		System.out.println("\n\nDeseja realizar outra operação? [S/N]");
		certeza = leia.next().toUpperCase();
		
		while (certeza.equals("S"))
			{
				System.out.println("\n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda"
						+ "\n3 - Adicionar uma constante as duas matrizes\n4 - Imprimir as matrizes");
				System.out.println("\nQual operação você deseja realizar? ");
				numero = leia.nextInt();
				
				while (numero<1 || numero>4)
				{
					System.out.println("\n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda"
							+ "\n3 - Adicionar uma constante as duas matrizes\n4 - Imprimir as matrizes");
					System.out.println("\nDigite novamente a operação a ser realizada: ");
					numero = leia.nextInt();
				}
				
				switch (numero)
				{
				case (1):
					
					System.out.println("1 - Somar as duas matrizes: ");
					for(x=0; x<2; x++)
					{
						System.out.println("\n");
						for(y=0;y<2;y++)
						{
							System.out.print(" "+matriz3[x][y]);
						}
					}
					break;
				
				case (2):
					
					System.out.println("2 - Subtrair a primeira matriz da segunda: ");
					for(x=0; x<2; x++)
					{
						System.out.println("\n");
						for(y=0;y<2;y++)
						{
							System.out.print(" "+matriz4[x][y]);
						}
					}
					break;
				
				case (3): 
					
					System.out.println("3 - Adicionar uma constante as duas matrizes: ");
					System.out.println("Digite a constante a ser adicionada: ");
					constante = leia.nextInt();
					matriz1[0][0] = matriz2[0][0] = constante;
					break;
				
				case (4):
					
					System.out.println("4 - Imprimir as matrizes");
					
					for(x=0; x<2; x++)
					{
						System.out.println("\n");
						for(y=0;y<2;y++)
						{
							System.out.print(" "+matriz1[x][y]);
						}
					}
					
					System.out.println("");
					for(x=0; x<2; x++)
					{
						System.out.println("\n");
						for(y=0;y<2;y++)
						{
							System.out.print(" "+matriz2[x][y]);
						}
					}
					break;
				}
					
				System.out.println("\nDeseja realizar outra operação? [S/N]");
				certeza = leia.next().toUpperCase();
					
			}
			
			System.out.println("\nAdeus!");
		
		}
}
