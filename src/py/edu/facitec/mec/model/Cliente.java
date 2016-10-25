/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author Usuario
 */
public class Cliente {
    //atributos
    private int codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    
    private Ciudad ciudad;
    
    private Double credito;
    private String celular;
    private boolean estado;
            
    //constructores
    public Cliente() {
        this.codigo = 0;
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.ciudad = new Ciudad();
        this.credito = 0d;
        this.celular = "";
        this.estado = false;
    }

    public Cliente(int codigo, String nombres, String apellidos, String direccion,
            Ciudad ciudad, Double credito,String celular, boolean estado) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.credito = credito;
        this.celular = celular;
        this.estado = estado;
    }

    public Cliente(int parseInt, String text, String text0, String text1, String text2, double parseDouble, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
    