package controllers;

/*Importación de librerías*/
import models.Juguete;
import models.Proveedor;


public class controller {
	private Juguete juguete = new Juguete();
	private Proveedor proveedor = new Proveedor();
	private int operacion = 0;
	
	public void recibirDatos(Object objeto, int operacion){
		/*Verifica que el objeto sea de tipo juguete o de tipo proveedor*/
	}
	
	public void cargarDatos(Object objeto){
		/*Carga los datos provenientes del modelo*/
	}
	
	public void eliminarDatos(Object objeto){
		/*Carga los datos provenientes del modelo*/
	}
	
	public void modificarDatos(Object objeto){
		/*Modifica los datos si es que existe ya en la base de datos*/
	}
	
}
