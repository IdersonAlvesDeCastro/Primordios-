
public class Main {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		System.out.println(c.getRaca()); // A sa�da ser� "Ra�a indefinida"

		Gato g = new Gato();
		System.out.println(g.getRaca()); // A sa�da ser� "Munchkin"

	}
}
