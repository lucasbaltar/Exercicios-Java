package Familia51;

import java.util.Scanner;

public class somaNumeros {

	public static void main(String[] args) {
		
		int numero, somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		somaNumero += numero;
		}
		while(numero !=0);
		
		System.out.println("O somat�rio dos n�meros digitados foi de: "+somaNumero);

	}

}
