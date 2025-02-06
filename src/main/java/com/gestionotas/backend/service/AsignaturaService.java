package com.gestionotas.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionotas.backend.Repository.AsignaturaRepository;
import com.gestionotas.backend.entity.Asignatura;


@Service
public class AsignaturaService implements IasignaturaService{
	 @Autowired
	    private AsignaturaRepository asignaturaRepository;

	    @Override
	    public List<Asignatura> getAllAsignaturas() {
	        return asignaturaRepository.findAll();
	    }

	    @Override
	    public Asignatura getAsignaturaById(Long id) {
	        return asignaturaRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada"));
	    }

	    @Override
	    public Asignatura createAsignatura(Asignatura asignatura) {
	        return asignaturaRepository.save(asignatura);
	    }

	    @Override
	    public Asignatura updateAsignatura(Long id, Asignatura asignatura) {
	        Asignatura existingAsignatura = getAsignaturaById(id);
	        existingAsignatura.setNombre(asignatura.getNombre());
	        return asignaturaRepository.save(existingAsignatura);
	    }

	    @Override
	    public void deleteAsignatura(Long id) {
	        asignaturaRepository.deleteById(id);
	    }
}
