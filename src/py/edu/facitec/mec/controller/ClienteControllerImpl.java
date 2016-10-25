/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Usuario
 */
public class ClienteControllerImpl implements ClienteController {
    private ClienteDao clienteDao;
    
    public ClienteControllerImpl(){
        this.clienteDao = new ClienteDaoImpl();
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteDao.guardar(cliente);
        
    }

    @Override
    public Cliente buscarClientePorCodigo(int codigo) {
        //aqui se llama al dao , de consultar
       return clienteDao.buscarClientePorCodigo(codigo);
        
    }

    @Override
    public List<Cliente> buscarClientePorFiltro(String busqueda) {
        return clienteDao.buscarClientePorFiltro(busqueda);
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return clienteDao.modificarCliente(cliente);
    }

    @Override
    public void eliminarCliente(int codigo) {
        clienteDao.eliminar(codigo);
    }

    @Override
    public List<Cliente> consultarClientesTodos() {
      return  clienteDao.recuperarClientes();
    }
    
}
