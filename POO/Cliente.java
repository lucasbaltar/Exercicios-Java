package Familia51;

public class Cliente { //Classe
	
	private String nome; //Atributo
	private int idade; //Atributo
	private double valorComprado; //Atributo
	
	public Cliente (String Nome, int Idade, double ValorComprado) //Construtor e Parâmetros
	{
		this.nome = Nome;
		this.idade = Idade;
		this.valorComprado = ValorComprado;
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

	public double getValorComprado() {
		return valorComprado;
	}

	public void setValorComprado(double valorComprado) {
		this.valorComprado = valorComprado;
	}
	
	public void imprimirInfo()
	{
		System.out.println(nome+" tem "+idade+" anos e gastou R$"+valorComprado);
	}

}
