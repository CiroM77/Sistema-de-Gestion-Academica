package com.gestionotas.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionotas.backend.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

}
