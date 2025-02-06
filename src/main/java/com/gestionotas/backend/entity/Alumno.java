
package com.gestionotas.backend.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ciro-
 */
@Entity
@Getter @Setter
public class Alumno {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String matricula;
    
	public Alumno() {
		super();
	}

	public Alumno(long id, String nombre, String matricula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.matricula = matricula;
	}
    
    
	 @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
	    private List<Nota> notas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
    
	 
	 
}
