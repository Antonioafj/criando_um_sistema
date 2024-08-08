package br.com.antonio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.antonio.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
