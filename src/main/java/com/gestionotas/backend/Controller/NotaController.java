package com.gestionotas.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionotas.backend.entity.Nota;
import com.gestionotas.backend.service.InotaService;

@RestController
@RequestMapping("/notas")
public class NotaController {
	@Autowired
    private InotaService notaService;

    @GetMapping
    public List<Nota> getAll() {
        return notaService.getAllNotas();
    }

    @GetMapping("/{id}")
    public Nota getById(@PathVariable Long id) {
        return notaService.getNotaById(id);
    }

    @PostMapping
    public Nota create(@RequestBody Nota nota) {
        return notaService.createNota(nota);
    }

    @PutMapping("/{id}")
    public Nota update(@PathVariable Long id, @RequestBody Nota nota) {
        return notaService.updateNota(id, nota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        notaService.deleteNota(id);
    }
}
