package Familia51;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lucas",24, 2000.20); //Instanciei um novo objeto dentro da classe Cliente.
		
		cliente.imprimirInfo(); //Puxei o m�todo imprimirInfo do objeto cliente que est� dentro da classe Cliente.
		
		cliente.setIdade(25);
		
		cliente.imprimirInfo();
		
		System.out.println("Lucas fez anivers�rio, agora ele tem "+cliente.getIdade()+" anos.");

	}

}
