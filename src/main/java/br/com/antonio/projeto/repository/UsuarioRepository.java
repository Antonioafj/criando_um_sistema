package br.com.antonio.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.antonio.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
