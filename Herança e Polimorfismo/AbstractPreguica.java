package Familia51;

public class AbstractPreguica extends AbstractAnimal{

public AbstractPreguica() {
		
		super("É uma preguiça");
	
	}

	@Override
	public void nome(String nome) {
		System.out.println("O nome da preguiça é " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("A preguiça tem " + idade + " anos.");
	}

	@Override
	public void som(String som) {
		System.out.println(som);
	}

}
