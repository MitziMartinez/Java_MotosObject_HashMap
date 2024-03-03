package Motos;

public class Modelos {
	//Atirbutes
	
	private String nombreModel;  //Este sera nuestra key para el HashMap
	private String tipoModel;
	private float precioModel;
	private float pesoModel;
	private int numCilindros;
	private Marcas marca;
	
	
	public Modelos() {
		
	}

	public Modelos(String nombreModel) {
		this.nombreModel = nombreModel;
	}

	public Modelos(String nombreModel, String tipoModel, float precioModel, float pesoModel, int numCilindros, Marcas marca) {
		this.nombreModel = nombreModel;
		this.tipoModel = tipoModel;
		this.precioModel = precioModel;
		this.pesoModel = pesoModel;
		this.numCilindros = numCilindros;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Modelos [nombreModel=" + nombreModel + ", tipoModel=" + tipoModel + ", precioModel=" + precioModel
				+ ", pesoModel=" + pesoModel + ", numCilindros=" + numCilindros + ", marca=" + marca+"]\n";
	}

	public String getNombreModel() {
		return nombreModel;
	}

	public void setNombreModel(String nombreModel) {
		this.nombreModel = nombreModel;
	}

	public String getTipoModel() {
		return tipoModel;
	}

	public void setTipoModel(String tipoModel) {
		this.tipoModel = tipoModel;
	}

	public float getPrecioModel() {
		return precioModel;
	}

	public void setPrecioModel(float precioModel) {
		this.precioModel = precioModel;
	}

	public float getPesoModel() {
		return pesoModel;
	}

	public void setPesoModel(float pesoModel) {
		this.pesoModel = pesoModel;
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public Marcas getMarca() {
		return marca;
	}

	public void setMarca(Marcas marca) {
		this.marca = marca;
	}
	
}
