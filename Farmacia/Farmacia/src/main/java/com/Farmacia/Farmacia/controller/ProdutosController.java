package com.Farmacia.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Farmacia.Farmacia.model.Produtos;
import com.Farmacia.Farmacia.repository.ProdutosRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	ResponseEntity<List<Produtos>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Produtos> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	ResponseEntity<List<Produtos>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByItemContainingIgnoreCase(nome));
	}
	
	@PostMapping
	ResponseEntity<Produtos> post (@RequestBody Produtos produtos){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(produtos));
	}
	
	@PutMapping
	ResponseEntity<Produtos> put (@RequestBody Produtos produtos){
		return ResponseEntity.ok(repository.save(produtos));
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
