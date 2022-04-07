package Familia51;

import java.util.Scanner;

public class Animal {
	
	public String nome;
	public int idade;
	public String som;
	
	Scanner leia = new Scanner(System.in);
	
	public Animal()
	{
		System.out.println("Digite o nome: ");
		nome=leia.nextLine();
		System.out.println("Digite a idade: ");
		idade=leia.nextInt();
		
		do {
		System.out.println("Faz som? [S/N]");
		som=leia.next().toUpperCase();
		
		
		
		}
		while(!som.equals("S") && !som.equals("N"));
		
		if (som.equals("S"))
		{
			som = "sim";
		}
		
		else if (som.equals("N"))
		{
			som = "nao emite";
		}
		
	}

	public Scanner leia() {
		return leia;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		
			this.som = som;
		}
		
	
	public void animal()
	{
		
		System.out.println("O animal "+nome+" possui "+idade+" anos e "+som+" emite som.");
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	
}

