package Familia51;

public class AbstractFinal {

	public static void main(String[] args) {
		
		AbstractCachorro cachorro = new AbstractCachorro();
		AbstractCavalo cavalo = new AbstractCavalo();
		AbstractPreguica preguica = new AbstractPreguica();
		
		System.out.println(cachorro.getAnimal());
		cachorro.nome("doguinho");
		cachorro.idade(8);
		cachorro.som("au au au\n");
		
		System.out.println(cavalo.getAnimal());
		cavalo.nome("cavalinho");
		cavalo.idade(20);
		cachorro.som("Riiiii...\n");
		
		System.out.println(preguica.getAnimal());
		preguica.nome("preguicinha");
		preguica.idade(40);
		preguica.som("uuuh");
	}

}
