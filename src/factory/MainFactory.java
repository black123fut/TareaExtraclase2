package factory;

public class MainFactory {

	public static void main(String[] args) {
		CasaBasica casita = HouseFactory.GetCasa("Madera", 4,2, false, 1, "40 km2");
		CasaBasica casota = HouseFactory.GetCasa("Block", 8,3, true, 2, "100 km2");
		CasaBasica casa = HouseFactory.GetCasa("prefabricada", 5,2, true, 1, "60 km2");
		
		System.out.println(casita.toString());
		System.out.println(casota.toString());
		System.out.println(casa.toString());
	}

}
