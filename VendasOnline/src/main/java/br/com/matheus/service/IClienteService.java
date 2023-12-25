/**
 * 
 */
package br.com.matheus.service;

import java.util.List;

import br.com.matheus.domain.Cliente;
import br.com.matheus.exceptions.DAOException;
import br.com.matheus.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
