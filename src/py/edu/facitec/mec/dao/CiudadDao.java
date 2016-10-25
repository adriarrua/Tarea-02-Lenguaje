/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author Usuario
 */
public interface CiudadDao {
    void guardar(Ciudad ciudad);
    boolean modificarCiudad(Ciudad ciudad);
    void eliminar(int codigo);

    
    
}
