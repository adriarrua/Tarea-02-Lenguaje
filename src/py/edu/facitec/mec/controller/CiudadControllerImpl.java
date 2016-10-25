/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import py.edu.facitec.mec.dao.CiudadDao;
import py.edu.facitec.mec.dao.CiudadDaoImpl;
import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author Usuario
 */
public class CiudadControllerImpl implements CiudadController{
    
     private CiudadDao ciudadDao;
     
     public CiudadControllerImpl() {
        this.ciudadDao = new CiudadDaoImpl();
     }
    @Override
    public void guardar(Ciudad ciudad) {   
         ciudadDao.guardar(ciudad);
    
    }
    @Override
    public boolean modificarCiudad(Ciudad ciudad) {
        return ciudadDao.modificarCiudad(ciudad);
    }
    @Override
    public void eliminar(int codigo) {
        ciudadDao.eliminar(codigo);
        
    }
    
}
