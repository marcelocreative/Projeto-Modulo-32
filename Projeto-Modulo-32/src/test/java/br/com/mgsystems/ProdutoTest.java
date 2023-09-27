package br.com.mgsystems;

import org.junit.Assert;
import org.junit.Test;

import br.com.mgsystems.dao.IProdutoDAO;
import br.com.mgsystems.dao.ProdutoDAO;
import br.com.mgsystems.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDAO produtoDAO;
	
	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void cadastrar() {
		
		Produto produto= new Produto();
		produto.setNome("XBox Series S");
		produto.setDescricao("Console Séries S 512gb + 1 Controle Branco");
		produto = produtoDAO.cadastrar(produto);
		
		Assert.assertNotNull(produto);
		Assert.assertNotNull(produto.getId());
		
	}

}
