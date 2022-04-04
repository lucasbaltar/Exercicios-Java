package Familia51;

import java.util.Scanner;

public class somaNumeros {

	public static void main(String[] args) {
		
		int numero, somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		somaNumero += numero;
		}
		while(numero !=0);
		
		System.out.println("O somatório dos números digitados foi de: "+somaNumero);

	}

}
