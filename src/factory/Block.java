package factory;

public class Block extends CasaBasica{

	@Override
	public String toString() {
		return "Material: Block, Numero de Cuartos: " + NumeroCuartos + ", Numero de Ba�os: " + NumeroBath +
				", Tiene Patio?: " + TienePatio +
				", Cantidad de Pisos: " + CantidadPisos + ", Area: " + Area;
	}

	public Block (int cuartos, int bath, boolean patio, int pisos, String area){
		this.NumeroCuartos = cuartos;
		this.NumeroBath = bath;
		this.TienePatio = patio;
		this.CantidadPisos = pisos;
		this.Area = area;	
	}
}
