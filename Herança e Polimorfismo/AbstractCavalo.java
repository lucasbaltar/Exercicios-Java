package Familia51;

public class AbstractCavalo extends AbstractAnimal {

	public AbstractCavalo() {
		
		super("� um cavalo");
	
	}
	@Override
	public void nome(String nome) {
		System.out.println("O nome do cavalo � "+nome);
	}
	@Override
	public void idade(int idade) {
		System.out.println("O cavalo tem "+idade+ " anos.");
	}
	@Override
	public void som(String som) {
		System.out.println(som);
	}
	
}
