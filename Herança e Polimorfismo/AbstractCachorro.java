package Familia51;

public class AbstractCachorro extends AbstractAnimal{
	
	public AbstractCachorro() {
		
		super("É um cachorro");
	}
	@Override
	public void nome(String nome) {
		System.out.println("O nome do cachorro é "+nome);
	}
	@Override
	public void idade(int idade) {
		System.out.println("O cachorro tem "+idade+ " anos.");
	}
	@Override
	public void som(String som) {
		System.out.println(som);
	}
	
}
