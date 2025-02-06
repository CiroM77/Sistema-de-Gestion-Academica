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

import com.gestionotas.backend.entity.Asignatura;
import com.gestionotas.backend.service.IasignaturaService;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {
	 @Autowired
	    private IasignaturaService asignaturaService;

	    @GetMapping
	    public List<Asignatura> getAll() {
	        return asignaturaService.getAllAsignaturas();
	    }

	    @GetMapping("/{id}")
	    public Asignatura getById(@PathVariable Long id) {
	        return asignaturaService.getAsignaturaById(id);
	    }

	    @PostMapping
	    public Asignatura create(@RequestBody Asignatura asignatura) {
	        return asignaturaService.createAsignatura(asignatura);
	    }

	    @PutMapping("/{id}")
	    public Asignatura update(@PathVariable Long id, @RequestBody Asignatura asignatura) {
	        return asignaturaService.updateAsignatura(id, asignatura);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        asignaturaService.deleteAsignatura(id);
	    }
}
