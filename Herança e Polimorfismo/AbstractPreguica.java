package Familia51;

public class AbstractPreguica extends AbstractAnimal{

public AbstractPreguica() {
		
		super("� uma pregui�a");
	
	}

	@Override
	public void nome(String nome) {
		System.out.println("O nome da pregui�a � " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("A pregui�a tem " + idade + " anos.");
	}

	@Override
	public void som(String som) {
		System.out.println(som);
	}

}
