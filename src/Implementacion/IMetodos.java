package Implementacion;

import Motos.Marcas;
import Motos.Modelos;

public interface IMetodos {
	//Metodos Ocupando el object
		public void guardar(Object obj, String nombreObj);
		
		public void editar(Object obj, String nombreObj);
		
		public void elimina(Object obj, String nombreObj);	
		
		//Metodos normales
		public Marcas buscarMarcas(Marcas marca);
		
		public Modelos buscarModelos(Modelos modelo);
		
		public void listarMarcas();
		
		public void listarModelos();
}
