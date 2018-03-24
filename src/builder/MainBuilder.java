package builder;

public class MainBuilder {

	public static void main(String[] args) {
		Pizza p = new PizzaBuilder().ConQueso(true).ConJamon(true).cocinar();
		System.out.println(p.toString());
	}

}
