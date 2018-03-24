package builder;

public class Pizza {
	private boolean Queso;
	private boolean Jamon;
	private boolean Peperoni;
	private boolean Pineapple;
	private boolean Hongos;
	private boolean Cebolla;
	private boolean Carne;
	
	public boolean isQueso() {
		return Queso;
	}
	public boolean isJamon() {
		return Jamon;
	}
	public boolean isPeperoni() {
		return Peperoni;
	}
	public boolean isPineapple() {
		return Pineapple;
	}

	public boolean isHongos() {
		return Hongos;
	}
	public boolean isCebolla() {
		return Cebolla;
	}
	public boolean isCarne() {
		return Carne;
	}
	
	public Pizza (PizzaBuilder builder) {
		this.Queso = builder.Queso;
		this.Jamon = builder.Jamon;
		this.Peperoni = builder.Peperoni;
		this.Pineapple = builder.Pineapple;
		this.Hongos = builder.Hongos;
		this.Cebolla = builder.Cebolla;
		this.Carne = builder.Carne;
	}
	@Override
	public String toString() {
		return "Pizza con: Queso=" + Queso + ", Jamon: " + Jamon + ", Peperoni: " + Peperoni + ", Pineapple: " +
                Pineapple + ", Hongos: " + Hongos + ", Cebolla: " + Cebolla + ", Carne: " + Carne;
	}
	
}
