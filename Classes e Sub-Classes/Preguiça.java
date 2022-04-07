package Familia51;

public class Preguiça extends Animal {

	public String deveSubir;

	public Preguiça() {

		do {
			System.out.println("A preguiça deve subir? [S/N]");
			deveSubir = leia.next().toUpperCase();

		} while (!deveSubir.equals("S") && !deveSubir.equals("N"));

		if (deveSubir.equals("S")) {
			deveSubir = "Deve subir";
		}

		else if (deveSubir.equals("N")) {
			deveSubir = "Não deve subir";
		}
	}

	public String getdeveSubir() {
		return deveSubir;
	}

	public void setdeveSubir(String deveSubir) {
		this.deveSubir = deveSubir;
	}

	public void subirPreguiça() {

		System.out.println("A preguiça deve subir? " + deveSubir);
	}

}
