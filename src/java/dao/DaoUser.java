/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author USER
 */
public class DaoUser {
    public List<User> findAllUser(){
        List<User> users = new ArrayList<User>();
        
        User u = new User();
        u.setUser("pepito");
        u.setPass("pepito01");
        users.add(u);
        
        u = new User();
        u.setUser("pablito");
        u.setPass("pablito01");
        users.add(u);
        
        u = new User();
        u.setUser("joselito");
        u.setPass("joselito01");
        users.add(u);
        
        return users;
        
    }
    
}
