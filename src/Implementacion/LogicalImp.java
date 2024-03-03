package Implementacion;

import java.util.HashMap;

import Motos.Marcas;
import Motos.Modelos;

public class LogicalImp implements IMetodos {
	
	//Declarar los HashMap
	HashMap<String, Marcas> hashMarcas = new HashMap <String, Marcas>();
	Marcas marca;
	
	HashMap<String, Modelos> hashModelos = new HashMap <String, Modelos>();
	Modelos modelo;
	
	@Override
	public void guardar(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		if (nombreObj.equals("marca")) {
			//Realizar casteo
			marca = (Marcas) obj;
			hashMarcas.put(marca.getNombreMarca(), marca);
		}else if (nombreObj.equals("modelo")) {
			//Realizar casteo
			modelo = (Modelos) obj;
			hashModelos.put(modelo.getNombreModel(), modelo);
		}
		
	}

	@Override
	public void editar(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		if (nombreObj.equals("marca")) {
		//Realizar casteo
			marca = (Marcas) obj;
			hashMarcas.put(marca.getNombreMarca(), marca);
			
		}else if (nombreObj.equals("modelo")) {
			//Realizar casteo
			modelo = (Modelos) obj;
			hashModelos.put(modelo.getNombreModel(), modelo);
			
		}
	}

	@Override
	public void elimina(Object obj, String nombreObj) {
		// TODO Auto-generated method stub
		if (nombreObj.equals("marca")) {
			//Realizar casteo
				marca = (Marcas) obj;
				hashMarcas.remove(marca.getNombreMarca());
				System.out.println("Se elimino la marca correctamente ");
			}else if (nombreObj.equals("modelo")) {
				//Realizar casteo
				modelo = (Modelos) obj;
				hashModelos.remove(modelo.getNombreModel());
				System.out.println("Se elimino el modelo correctamente ");
			}
	}

	@Override
	public void listarModelos() {
		// TODO Auto-generated method stub
		System.out.println(hashModelos);
	}

	@Override
	public void listarMarcas() {
		// TODO Auto-generated method stub
		System.out.println(hashMarcas);
	}

	@Override
	public Marcas buscarMarcas(Marcas marca) {
		// TODO Auto-generated method stub
		return hashMarcas.get(marca.getNombreMarca());
	}

	@Override
	public Modelos buscarModelos(Modelos modelo) {
		// TODO Auto-generated method stub
		return hashModelos.get(modelo.getNombreModel());
	}

	
	
}
