package Motos;

public class Marcas {
	//Atributes
	
	private int numRanking;
	private String nombreMarca; // Esta sera nuestra key para HashMap
	private String paisOrigen;
	
	public Marcas() {
	}

	public Marcas(String nombre) {
		this.nombreMarca = nombre;
	}

	public Marcas(int numRanking, String nombre, String paisOrigen) {
		this.numRanking = numRanking;
		this.nombreMarca = nombre;
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Marcas [numRanking=" + numRanking + ", nombre=" + nombreMarca + ", paisOrigen=" + paisOrigen + "]\n";
	}

	public int getNumRanking() {
		return numRanking;
	}

	public void setNumRanking(int numRanking) {
		this.numRanking = numRanking;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombre) {
		this.nombreMarca = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
}
