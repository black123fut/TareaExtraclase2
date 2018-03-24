package factory;

public class Madera extends CasaBasica{

	@Override
	public String toString() {
		return "Material: Madera, Numero de Cuartos: " + NumeroCuartos + ", Numero de Ba�os: " + NumeroBath + ", Tiene Patio?: " + TienePatio
				+ ", Cantidad de Pisos: " + CantidadPisos + ", Area: " + Area;
	}

	public Madera (int cuartos, int bath, boolean patio, int pisos, String area){
		this.NumeroCuartos = cuartos;
		this.NumeroBath = bath;
		this.TienePatio = patio;
		this.CantidadPisos = pisos;
		this.Area = area;	
	}
}