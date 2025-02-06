package com.gestionotas.backend.service;

import java.util.List;

import com.gestionotas.backend.entity.Nota;

public interface InotaService {
	List<Nota> getAllNotas();
    Nota getNotaById(Long id);
    Nota createNota(Nota nota);
    Nota updateNota(Long id, Nota nota);
    void deleteNota(Long id);
}
