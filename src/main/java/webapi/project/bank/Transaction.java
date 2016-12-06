/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project.bank;

import java.util.Date;

/**
 *
 * @author Fasial
 */
public class Transaction {
    
    int id;
    Date date;
    Double totalTransaction;
    String description;
    Double balance;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public Double getTotalTranaction(){
        return totalTransaction;
    }
    
    public void setTotalTransaction(Double totalTransaction){
        this.totalTransaction = totalTransaction;
    }
    
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    public Double getBalance(){
        return balance;
    }
    
    public void setBalance(Double balance){
        this.balance = balance;
    }
}
