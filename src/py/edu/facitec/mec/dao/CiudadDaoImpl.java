/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.util.ConexionManager;

/**
 *
 * @author Usuario
 */
public class CiudadDaoImpl implements CiudadDao {

    @Override
    public void guardar(Ciudad ciudad) {
        String sql = "Insert into Ciudad(nombre, iso, estado)"
                +" values('"+ciudad.getNombre()+"', '"+ciudad.getIso()+"',"
                + "'"+ciudad.getEstado()+"' )";
                
        System.out.println("sql = "+sql);
        ConexionManager.conectar();
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConexionManager.desconectar();
    }
    @Override
    public boolean modificarCiudad(Ciudad ciudad) {
        String sql = "update clientes set nombres = '"+ciudad.getNombre()+"',"
                + "iso'"+ciudad.getIso()+"',estado'"+ciudad.getEstado()+"'"
                +"where codigo"+ciudad.getCodigo();
        boolean resultado = false;
            ConexionManager.conectar();
        try {
            resultado = ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            ConexionManager.desconectar();
            
            return resultado;
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "delete from clientes where codigo"+codigo+"";
        ConexionManager.conectar();
        try {
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionManager.desconectar();
        
    }
    
}
