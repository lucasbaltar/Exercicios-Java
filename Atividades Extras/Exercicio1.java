package Familia51;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		int idade, anos, dias, meses, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade em anos, meses e dias. ");
		
		System.out.println("Anos: ");
		anos = leia.nextInt();
		
		System.out.println("Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		x = anos * 365;
		y = meses * 30;
		
		idade = x + y + dias;
		
		System.out.println("A sua idade escrita em dias é: "+idade);
		
		
		
	}

}
