/**
 * 
 */
package br.com.matheus.service;

import java.util.List;

import br.com.matheus.domain.Produto;
import br.com.matheus.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
