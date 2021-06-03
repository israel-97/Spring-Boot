package com.LojaDeGames.Categoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames.Categoria.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
