package ar.edu.ies6.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.repository.AlumnoRepository;

@Service
public class AlumnoService {
	@Autowired
	AlumnoRepository alumnoRepository;

	public void guardarAlumnos(Alumno alumno) {
		//metodo para guardar
		alumno.setEstado(true);
		alumnoRepository.save(alumno);
	}
	public void eliminarAlumno(Integer dni) throws Exception{
		//eliminar un objeto por su identificador
		Alumno auxiliar=new Alumno();
		auxiliar=encontrarUnAlumno (dni);
		auxiliar.setEstado(false);
		alumnoRepository.save(auxiliar);
	}
	public List<Alumno>buscartodosAlumnos(){
		//algoritmo para buscar alumnos
		//List<Alumnos>listado=new ArrayList<>();{
		//return listado;
		
		return (List<Alumno>) alumnoRepository.findByEstado(true);
	}
	
    public void modificarAlumnos(Alumno alumno) {	
    	
    }
    public Alumno encontrarUnAlumno(Integer dni)throws Exception{
    	return alumnoRepository. findById(dni).orElseThrow(()->new Exception("Alumno no encontrado"));
    }
}