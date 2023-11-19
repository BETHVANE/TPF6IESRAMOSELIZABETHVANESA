
package ar.edu.ies6.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ies6.model.Alumno;



public class Listadodealumno {

	private static List <Alumno> listado = new ArrayList<>();
	public Listadodealumno() {	
	}
	public static List<Alumno> getListado(){
		return listado;
	}
	public static void setListado(List<Alumno> listado) {
		Listadodealumno.listado=listado;
	}
		
}


