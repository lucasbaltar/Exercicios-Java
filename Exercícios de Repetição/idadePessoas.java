package Familia51;

import java.util.Scanner;

public class idadePessoas {

	public static void main(String[] args) {
		
		int idade, maisde50=0, menosde21=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		while(idade != -99)
		{
			if (idade > 50)
			{
				maisde50 += 1;
			}
			if (idade < 21)
			{
				menosde21 += 1;
			}
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nA quantidade de pessoas com mais de 50 anos é de : "+maisde50);
		System.out.println("\nA quantidade de pessoas com menos de 21 anos é de : "+menosde21);
	}

}
