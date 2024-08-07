package br.com.antonio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.antonio.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
