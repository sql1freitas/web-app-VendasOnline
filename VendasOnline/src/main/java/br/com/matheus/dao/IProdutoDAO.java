/**
 * 
 */
package br.com.matheus.dao;

import java.util.List;

import br.com.matheus.dao.generic.IGenericDAO;
import br.com.matheus.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
