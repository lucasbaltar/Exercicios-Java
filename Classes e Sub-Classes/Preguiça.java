package Familia51;

public class Pregui�a extends Animal {

	public String deveSubir;

	public Pregui�a() {

		do {
			System.out.println("A pregui�a deve subir? [S/N]");
			deveSubir = leia.next().toUpperCase();

		} while (!deveSubir.equals("S") && !deveSubir.equals("N"));

		if (deveSubir.equals("S")) {
			deveSubir = "Deve subir";
		}

		else if (deveSubir.equals("N")) {
			deveSubir = "N�o deve subir";
		}
	}

	public String getdeveSubir() {
		return deveSubir;
	}

	public void setdeveSubir(String deveSubir) {
		this.deveSubir = deveSubir;
	}

	public void subirPregui�a() {

		System.out.println("A pregui�a deve subir? " + deveSubir);
	}

}
