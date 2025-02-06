package com.gestionotas.backend.service;

import java.util.List;

import com.gestionotas.backend.entity.Asignatura;

public interface IasignaturaService {
	List<Asignatura> getAllAsignaturas();
    Asignatura getAsignaturaById(Long id);
    Asignatura createAsignatura(Asignatura asignatura);
    Asignatura updateAsignatura(Long id, Asignatura asignatura);
    void deleteAsignatura(Long id);
}
