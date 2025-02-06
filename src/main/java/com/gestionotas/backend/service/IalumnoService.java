package com.gestionotas.backend.service;

import java.util.List;

import com.gestionotas.backend.entity.Alumno;

public interface IalumnoService {
	List<Alumno> getAllAlumnos();

    Alumno getAlumnoById(Long id);

    Alumno createAlumno(Alumno alumno);

    Alumno updateAlumno(Long id, Alumno alumno);

    void deleteAlumno(Long id);
}
