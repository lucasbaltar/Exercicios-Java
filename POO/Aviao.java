package Familia51;

public class Aviao {
	
	private String companhia;
	private String modelo;
	private int tempoDeUso;
	
	public Aviao (String companhia, String modelo, int tempoDeUso)
	{
		this.companhia = companhia;
		this.modelo = modelo;
		this.tempoDeUso = tempoDeUso;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTempoDeUso() {
		return tempoDeUso;
	}

	public void setTempoDeUso(int tempoDeUso) {
		this.tempoDeUso = tempoDeUso;
	}
	
	public void imprimirInfo() {
		System.out.println("O aviao da companhia "+companhia+" é o do modelo "+modelo+" e possui "+tempoDeUso+" anos de tempo de uso." );
	}

}
