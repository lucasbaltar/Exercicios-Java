package Familia51;
	
	import java.util.Scanner;
	
	public class Cavalo extends Animal {
		
		public String deveCorrer1;
		
		public Cavalo() {
			
			do {
				System.out.println("O cavalo deve correr? [S/N]");
				deveCorrer1=leia.next().toUpperCase();
				
				
				}
				while(!deveCorrer1.equals("S") && !deveCorrer1.equals("N"));
				
				if (deveCorrer1.equals("S"))
				{
					deveCorrer1 = "Deve correr";
				}
				
				else if (deveCorrer1.equals("N"))
				{
					deveCorrer1 = "Não deve correr";
				}
		}

		public String getDeveCorrer1() {
			return deveCorrer1;
		}

		public void setDeveCorrer1(String deveCorrer1) {
			this.deveCorrer1 = deveCorrer1;
		}
		
		
		public void correrCavalo()
		{
			
			System.out.println("O cavalo deve correr? "+deveCorrer1);
		}


}
