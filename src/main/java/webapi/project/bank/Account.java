/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project.bank;

import java.util.List;

/**
 *
 * @author Fasial
 */
public class Account {
    
    int accNumber;
    String sortCode;
    Double balance;
    List<Transaction> transactions;
    
    
    public int getAccNumber(){
        return accNumber;
    }
    
    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }
    
    public String getSortCode(){
        return sortCode;
    }
    
    public void setSortCode(String sortCode){
        this.sortCode = sortCode;
    }
    
    public Double getBalance(){
        return balance;
    }
    
    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void add(List<Account> accounts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
