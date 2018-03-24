package factory;

public class HouseFactory {
	public static CasaBasica GetCasa(String material,int cuartos, int bath, boolean patio, int pisos, String area) {
		if (material.equalsIgnoreCase("Block")) {
			return new Block(cuartos,bath, patio, pisos, area);
		}
		else if (material.equalsIgnoreCase("Madera")) {
			return new Madera(cuartos,bath, patio, pisos, area);
		}
		else if (material.equalsIgnoreCase("Prefabricada")) {
			return new Prefabricada(cuartos,bath, patio, pisos, area);
		}
		return null;
	}
}
