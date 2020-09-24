/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Personas;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class ControlBorrarPersona {
    String nombreCompleto = "";
    String cargo = "";
    String ciudad = "";
    Personas person;

    public ControlBorrarPersona(){
    }
    
        public void buscar(String documento) throws Exception {
        validarDato(documento,"Documento");
        int auxDoc = Integer.parseInt(documento);
        person = DAOFactory.getPersona().consultarID(auxDoc);
        if(person == null){
            throw new Exception("Documento no existe");
        }
        if (person.getActivo()== 0) {
          throw  new Exception("Esta persona ya ha sido borrada del sistema");
        }
        nombreCompleto = person.getNombre() +" "+ person.getApellido();
        cargo = person.getCargo();
        ciudad = person.getCiudad();
    }
        
    private void validarDato(String dato,String nombreDato) throws Exception {
        if("".equals(dato)){
            throw  new Exception(nombreDato+" esta vacio");
        }    
        if(!dato.matches("\\d*")){
            throw  new Exception(nombreDato+" debe ser numerico");
        }
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getCargo() {
        return cargo;
    } 
    public String getCiudad() {
        return ciudad;
    }
    
    public void borradoLogico() throws Exception{
        person.setActivo((short)0);
        EntityManagerHelper.beginTransaction();
        DAOFactory.getPersona().insertar(person);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
    }  
}
