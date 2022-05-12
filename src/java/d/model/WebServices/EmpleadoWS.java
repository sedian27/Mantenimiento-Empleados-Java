/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.model.WebServices;

import d.model.dao.EmpleadoDAO;
import d.model.pojos.Empleado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "EmpleadoWS")
public class EmpleadoWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarEmpleados")
    public List<Empleado> ListarEmpleados() {
        EmpleadoDAO data = new EmpleadoDAO();
        List<Empleado> empleados = data.list();
        return data.list();
    }
}
