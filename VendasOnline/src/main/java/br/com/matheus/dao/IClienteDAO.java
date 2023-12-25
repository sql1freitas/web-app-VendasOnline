/**
 * 
 */
package br.com.matheus.dao;

import java.util.List;

import br.com.matheus.dao.generic.IGenericDAO;
import br.com.matheus.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
