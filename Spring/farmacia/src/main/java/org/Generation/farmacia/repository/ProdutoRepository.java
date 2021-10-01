package org.Generation.farmacia.repository;

import java.util.List;

import org.Generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByTituloContainingIgnoreCase (String nome);
}
