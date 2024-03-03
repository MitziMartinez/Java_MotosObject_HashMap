package Main;

import java.util.Scanner;

import Implementacion.LogicalImp;
import Motos.Marcas;
import Motos.Modelos;

public class Principal {
	
	public static void main(String[] args) {
	//Declarar las variables
	int numRanking;
	String nombreMarca; // Esta sera nuestra key para HashMap
	String paisOrigen;
	Marcas marca;
	
	String nombreModel;  //Este sera nuestra key para el HashMap
	String tipoModel;
	float precioModel;
	float pesoModel;
	int numCilindros;
	Modelos modelo;
	
	Scanner lectura = null;
	int menuPrin, menuMarcas, menuModelos;
	
	//Instancia de clase
	LogicalImp imp = new LogicalImp();
	
	do {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1----CRUD DE MARCAS");
		System.out.println("2----CRUD DE MODELOS");
		System.out.println("3---SALIR");
		
		lectura = new Scanner(System.in);
		menuPrin = lectura.nextInt();
		
		switch(menuPrin){
		case 1: // -------------------------CRUD MARCAS------------
			do {
				System.out.println("MENU DE MARCAS");
				System.out.println("1---GUARDAR");
				System.out.println("2---LISTAR");
				System.out.println("3---BUSCAR");
				System.out.println("4---EDITAR RANKING");
				System.out.println("5---ELIMINAR");
				System.out.println("6---REGRESAR M.P");
				lectura = new Scanner(System.in);
				menuMarcas = lectura.nextInt();
				
				switch (menuMarcas) {
				case 1:
					//Leer atributos
					System.out.println("Ingrese el num Ranking en el que se encuentra la marca:");
					lectura = new Scanner(System.in);
					numRanking = lectura.nextInt();
					
					System.out.println("Ingrese el nombre de la marca:");
					lectura = new Scanner(System.in);
					nombreMarca = lectura.nextLine();
					
					System.out.println("Ingrese el pais de origen");
					lectura = new Scanner(System.in);
					paisOrigen = lectura.nextLine();
					
					//Contruir obj con atributos y Guardar
					marca = new Marcas(numRanking, nombreMarca, paisOrigen);				
					imp.guardar(marca, "marca");
					break;
				case 2:
					imp.listarMarcas();
					break;
				case 3:
					System.out.println("Ingrese el nombre de la marca: ");
					lectura = new Scanner(System.in);
					nombreMarca = lectura.nextLine();
					
					marca = new Marcas (nombreMarca);
					marca = imp.buscarMarcas(marca);
					System.out.println("Se encontro "+ marca);
					break;
				case 4:
					//BUSCAR POR MARCA
					System.out.println("Ingrese el nombre de la marca: ");
					lectura = new Scanner(System.in);
					nombreMarca = lectura.nextLine();
					marca = new Marcas (nombreMarca);
					marca = imp.buscarMarcas(marca);
					
					System.out.println("Se encontro " + marca);
					
					//INGRESAR NUEVOS DATOS DE NUM RANKING
					System.out.println("Ingrese el nuevo num de Ranking");		
					lectura = new Scanner(System.in);
					numRanking = lectura.nextInt();
					
					//EDITAR
					marca.setNumRanking(numRanking);
					imp.editar(marca, "marca");
					
					break;
				case 5:
					//ELIMINAR
					System.out.println("Ingrese el nombre de la marca a eliminar: ");
					lectura = new Scanner(System.in);
					nombreMarca = lectura.nextLine();
					marca = new Marcas (nombreMarca);
					imp.elimina(marca, "marca");			
					break;
				case 6:
					break;			
				}		
			} while (menuMarcas < 6);
			break;
		case 2:  // -------------------------CRUD MODELOS------------
			do {
				System.out.println("MENU DE MODELOS");
				System.out.println("1---GUARDAR");
				System.out.println("2---LISTAR");
				System.out.println("3---BUSCAR");
				System.out.println("4---EDITAR PRECIO");
				System.out.println("5---ELIMINAR");
				System.out.println("6---REGRESAR M.P");
				lectura = new Scanner(System.in);
				menuModelos = lectura.nextInt();
				
				switch (menuModelos) {
				case 1:
					//Leer atributos
							
					System.out.println("Ingrese el nombre del modelo");
					lectura = new Scanner(System.in);
					nombreModel = lectura.nextLine();
					
					System.out.println("Ingrese el tipo de Modelo:");
					lectura = new Scanner(System.in);
					tipoModel = lectura.nextLine();
					
					System.out.println("Ingrese el precio del modelo");
					lectura = new Scanner(System.in);
					precioModel = lectura.nextFloat();
					
					System.out.println("Ingrese el peso del modelo");
					lectura = new Scanner(System.in);
					pesoModel = lectura.nextFloat();
						
					System.out.println("Ingresel el numero de Cilindro");
					lectura = new Scanner(System.in);
					numCilindros = lectura.nextInt();
					
					//Mostrar que Marcas tenemos
					System.out.println("Registro de marcas: ");
					imp.listarMarcas();
					
					//Buscar por marca
					System.out.println("Ingrese la marca: ");
					lectura = new Scanner(System.in);
					nombreMarca = lectura.nextLine();
					
					marca = new Marcas(nombreMarca);
					marca = imp.buscarMarcas(marca);
					
					//Contruir obj con atributos y Guardar
					modelo = new Modelos(nombreModel, tipoModel, precioModel, pesoModel, numCilindros,marca);			
					imp.guardar(modelo, "modelo");
					break;
				case 2:
					imp.listarModelos();
					break;
				case 3:
					System.out.println("Ingrese el nombre de la modelo: ");
					lectura = new Scanner(System.in);
					nombreModel = lectura.nextLine();
					
					modelo = new Modelos (nombreModel);
					modelo = imp.buscarModelos(modelo);
					System.out.println("Se encontro" + modelo);
					break;
				case 4:
					//BUSCAR POR MODELO
					System.out.println("Ingrese el nombre del modelo: ");
					lectura = new Scanner(System.in);
					nombreModel = lectura.nextLine();
					modelo = new Modelos (nombreModel);
					modelo = imp.buscarModelos(modelo);
					System.out.println("Se encontro" + modelo);
					
					//INGRESAR NUEVOS DATOS DE PRECIO
					System.out.println("Ingrese el nuevo precio ");		
					lectura = new Scanner(System.in);
					precioModel = lectura.nextFloat();
					
					//EDITAR
					modelo.setPrecioModel(precioModel);
					imp.editar(modelo, "modelo");
					
					break;
				case 5:
					//ELIMINAR
					System.out.println("Ingrese el nombre de la modelo a eliminar: ");
					lectura = new Scanner(System.in);
					nombreModel = lectura.nextLine();
					modelo = new Modelos (nombreModel);
					imp.elimina(modelo, "modelo");			
					break;
				case 6:
					break;			
				}		
			} while (menuModelos < 6);		
			break;
		case 3:
			break;	
		}		
	}while(menuPrin< 3);

	}
}
