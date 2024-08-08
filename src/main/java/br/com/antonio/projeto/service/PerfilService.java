package br.com.antonio.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.antonio.projeto.dto.PerfilDTO;
import br.com.antonio.projeto.entity.PerfilEntity;
import br.com.antonio.projeto.repository.PerfilRepository;


@Service
public class PerfilService {
	
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	public List<PerfilDTO> listarTodos(){
		List<PerfilEntity> perfil = perfilRepository.findAll();
		return perfil.stream().map(PerfilDTO::new).toList();
	}
	
	public void inserir(PerfilDTO perfil) {
		PerfilEntity perfilEntity = new PerfilEntity(perfil);
		perfilRepository.save(perfilEntity);
	
	}
	
	public PerfilDTO alterar(PerfilDTO perfil) {
		PerfilEntity perfilEntity = new PerfilEntity(perfil);
		return new PerfilDTO(perfilRepository.save(perfilEntity));
	}
	
	public void excluir(Long id) {
		PerfilEntity perfilEntity = perfilRepository.findById(id).get();
		perfilRepository.delete(perfilEntity);
		
	}
	
	public PerfilDTO buscarPorId(Long id) {
		return new PerfilDTO(perfilRepository.findById(id).get());
		 
	}

}
