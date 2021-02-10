/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Diego Weidle Rost
 */
public class AccountService implements Serializable {
    
    private final String ABE = "abe";
    private final String BARB = "barb";
    private final String PSWD = "password";
    
    public AccountService () {
        
    }
    
    public User login (String username, String password) {
        if ((username.equals(ABE) || username.equals(BARB)) && password.equals(PSWD)) {
            return new User(username, null);
        }
        return null;
    }
}
