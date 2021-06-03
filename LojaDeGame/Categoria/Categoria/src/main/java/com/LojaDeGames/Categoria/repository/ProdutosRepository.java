package com.LojaDeGames.Categoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames.Categoria.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	public List<Produtos> findAllByItemContainingIgnoreCase(String item);
}
