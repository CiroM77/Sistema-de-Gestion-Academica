package com.gestionotas.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionotas.backend.Repository.NotaRepository;
import com.gestionotas.backend.entity.Nota;

@Service
public class NotaService implements InotaService{
	 @Autowired
	    private NotaRepository notaRepository;

	    @Override
	    public List<Nota> getAllNotas() {
	        return notaRepository.findAll();
	    }

	    @Override
	    public Nota getNotaById(Long id) {
	        return notaRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Nota no encontrada"));
	    }

	    @Override
	    public Nota createNota(Nota nota) {
	        return notaRepository.save(nota);
	    }

	    @Override
	    public Nota updateNota(Long id, Nota nota) {
	        Nota existingNota = getNotaById(id);
	        existingNota.setCalificacion(nota.getCalificacion());
	        existingNota.setAlumno(nota.getAlumno());
	        existingNota.setAsignatura(nota.getAsignatura());
	        return notaRepository.save(existingNota);
	    }

	    @Override
	    public void deleteNota(Long id) {
	        notaRepository.deleteById(id);
	    }
}
