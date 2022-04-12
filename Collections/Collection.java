package Familia51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

	public static void main(String[] args) {
		
		//List
		
		List<String> lista = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		int x;
		String produto;
		
		do {
		System.out.println("\nOp��o 1: Adicionar produto.\nOp��o 2: Remover produto.\nOp��o 3: Atualizar produtos do estoque."
				+ "\nOp��o 4: Mostrar os produtos em estoque. \nOp��o 5: Encerrar o programa...");
		
		System.out.println("\nDigite uma op��o: ");
		x = leia.nextInt();
		
			switch (x) 
			{
			
			case (1):
				leia.nextLine();
				System.out.println("\nDigite o produto que seja adicionar: ");
				produto = leia.nextLine();
				lista.add(produto);
				break;
				
			
			case (2):
				leia.nextLine();
				System.out.println("\nDigite o produto que voc� quer remover: ");
				String produtoR = leia.nextLine();
				if (lista.contains(produtoR))
				{
					lista.remove(produtoR);
				}
				else
				{
					System.out.println("\nEsse produto n�o existe");
				}
				System.out.println(lista);
				break;
			case (3):
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar:");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que ser� substitu�do: ");
				String novo = leia.nextLine();
				if(lista.contains(novo))
				{
					lista.remove(verifica);
					lista.add(novo);
				}
				else
				{
					System.out.println("\nEsse produto n�o existe");
				}
				System.out.println(lista);
				break;
				
			case (4):
				leia.nextLine();
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(lista);
				break;
			default:
				if (x<0 || x>4)
				{
					System.out.println("Op��o errada, digite novamente: ");
				}
				else
				{
					System.out.println("Voc� finalizou o programa...");
				}
			
			}
		}
		while(x!=0);
		
	
	}

}
