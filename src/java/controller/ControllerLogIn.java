/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoUser;
import model.User;

/**
 *
 * @author USER
 */
public class ControllerLogIn {
    
    public boolean LogIn(String user, String pass){
    
        DaoUser daoUser = new DaoUser();
        
        for (User u: daoUser.findAllUser()){
           if(u.getUser().equals(user) && u.getPass().equals(pass)){
                return true;
            }
        }
        return false;
    }
    
}
