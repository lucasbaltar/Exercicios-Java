package Familia51;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idade, anos, meses, dias, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade em dias e a descubra em anos, meses e dias ");
		
		System.out.println("Dias: ");
		x = leia.nextInt();
		
		anos = x / 365;
		
		meses = (x % 365) / 30;
		
		dias = (x % 365) % 30;
		
		System.out.println("A sua idade em anos, meses e dias é: "+anos+ " anos, "+meses+" meses, e "+dias+" dias.");
		
		

	}

}
