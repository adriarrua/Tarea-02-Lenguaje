/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Usuario
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    //se crea un metodo de consultar
    Cliente buscarClientePorCodigo(int Codigo);
    //se crea un metodo de modificar
    boolean modificarCliente(Cliente cliente);
    void eliminar(int codigo);
    List<Cliente> buscarClientePorFiltro(String filtro);  //nombre, apellido, direccion

    List<Cliente> recuperarClientes();
    
}
