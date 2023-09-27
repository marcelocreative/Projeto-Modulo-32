package br.com.mgsystems.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mgsystems.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Produto cadastrar(Produto produto) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return produto;
	}

}
