package Familia51;

import java.util.Scanner;

public class Cachorro extends Animal{
	
	public String deveCorrer;
	
	public Cachorro() {
		
		do {
			System.out.println("O cachorro deve correr? [S/N]");
			deveCorrer=leia.next().toUpperCase();
			
			
			}
			while(!deveCorrer.equals("S") && !deveCorrer.equals("N"));
			
			if (deveCorrer.equals("S"))
			{
				deveCorrer = "Deve correr";
			}
			
			else if (deveCorrer.equals("N"))
			{
				deveCorrer = "Não deve correr";
			}
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	
	public void correrCachorro()
	{
		
		System.out.println("O cachorro deve correr? "+deveCorrer);
	}

}
