package com.gestionotas.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionotas.backend.Repository.AlumnoRepository;
import com.gestionotas.backend.entity.Alumno;

@Service
public class AlumnoService implements IalumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

	
	
	@Override
	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno getAlumnoById(Long id) {
		return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
	}

	@Override
	public Alumno createAlumno(Alumno alumno) {
		 return alumnoRepository.save(alumno); 
	}

	@Override
	public Alumno updateAlumno(Long id, Alumno alumno) {
		Alumno existingAlumno = getAlumnoById(id);
        existingAlumno.setNombre(alumno.getNombre());
        existingAlumno.setMatricula(alumno.getMatricula());
        return alumnoRepository.save(existingAlumno);
	}

	@Override
	public void deleteAlumno(Long id) {
		alumnoRepository.deleteById(id);
		
	}

}
