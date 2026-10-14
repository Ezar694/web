/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package backingbean;

import controller.ControllerLogIn;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USER
 */
@ManagedBean(name = "beanIngreso")
@SessionScoped
public class beanIngreso implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private String user;
    private String pass;
    
    public beanIngreso() {
    }
    
    public String ingresoAlSistema() {
        ControllerLogIn controllerLogIn = new ControllerLogIn();
        if (controllerLogIn.LogIn(user, pass)) {
            return "yes";    
        } else {
            return "no";
        }
    }

    // Mantiene compatibilidad en caso de llamada con mayúscula
    public String IngresoAlSistema() {
        return ingresoAlSistema();
    }

    public String retornarAlIndex() {
        return "returnIndex";
    }
}
