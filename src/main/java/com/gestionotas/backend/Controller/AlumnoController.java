package com.gestionotas.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gestionotas.backend.entity.Alumno;
import com.gestionotas.backend.service.IalumnoService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private IalumnoService alumnoService; 

    @GetMapping
    public List<Alumno> getAll() {
        return alumnoService.getAllAlumnos();
    }

    @GetMapping("/{id}")
    public Alumno getById(@PathVariable Long id) {
        return alumnoService.getAlumnoById(id);
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) {
        return alumnoService.createAlumno(alumno);
    }

    @PutMapping("/{id}")
    public Alumno update(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.updateAlumno(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        alumnoService.deleteAlumno(id);
    }
}
