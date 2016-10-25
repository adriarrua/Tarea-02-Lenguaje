/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Usuario
 */
public interface ClienteController {
        void guardarCliente(Cliente cliente);
       ///se le agrega para buscar cliente por codigo , consula
       Cliente buscarClientePorCodigo(int codigo); // se crea metodo busca y le pongo parametro codigo
       List<Cliente> buscarClientePorFiltro(String busqueda);
       boolean modificarCliente(Cliente cliente);
       void eliminarCliente(int codigo);

    List<Cliente>consultarClientesTodos();
    
}
