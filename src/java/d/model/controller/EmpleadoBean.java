/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.model.controller;

import d.model.dao.EmpleadoDAO;
import d.model.pojos.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "empleadoBean")
@RequestScoped
public class EmpleadoBean implements Serializable{
    
    private List<Empleado> empleadoList;
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    
    public EmpleadoBean() {
    }
    
    public List<Empleado> getEmpleados(){
        empleadoList = empleadoDAO.list();
        return empleadoList;
    }
}
