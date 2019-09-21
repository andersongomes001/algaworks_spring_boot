package com.anderson.gc.repository;

import com.anderson.gc.model.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadosRepository extends JpaRepository<Convidados, Long> {
}
