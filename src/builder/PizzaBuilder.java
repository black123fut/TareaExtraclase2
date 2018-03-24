package builder;

public class PizzaBuilder {
	public boolean Queso;
	public boolean Jamon;
	public boolean Peperoni;
	public boolean Pineapple;
	public boolean Hongos;
	public boolean Cebolla;
	public boolean Carne;
	
	public PizzaBuilder ConQueso(boolean opcion) {
		this.Queso = opcion;
		return this;
	}
	
	public PizzaBuilder ConJamon(boolean opcion) {
		this.Jamon = opcion;
		return this;
	}
	
	public PizzaBuilder ConPeperoni(boolean opcion) {
		this.Peperoni = opcion;
		return this;
	}
	
	public PizzaBuilder ConPineapple(boolean opcion) {
		this.Pineapple = opcion;
		return this;
	}
	
	public PizzaBuilder ConHongos(boolean opcion) {
		this.Hongos = opcion;
		return this;
	}
	
	public PizzaBuilder ConCebolla(boolean opcion) {
		this.Cebolla = opcion;
		return this;
	}

	public PizzaBuilder ConCarne(boolean opcion) {
		this.Carne = opcion;
		return this;
	}
	
	public Pizza cocinar() {
		return new Pizza(this);
	}
}
