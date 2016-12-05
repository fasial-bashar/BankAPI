/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapi.project.resource;

import java.util.ArrayList;
import java.util.List;
import webapi.project.bank.Account;

/**
 *
 * @author Fasial
 */
public class AccountResource {
    List <Account> accounts;
    
    public AccountResource(){
        accounts = new ArrayList<>();
    }
    
    public Account getAccounts(){
        Account account = new Account();
        account.setAccNumber(765456);
        account.setSortCode("B123");
        account.setBalance(80.89);
        return account;
    }
    
    public List<Account>getAccount(){
        Account account = getAccounts();
        accounts.add(account);
        accounts.add(account);
        return accounts;
    }
    
    public void setAccount(List<Account> accounts){
        this.accounts = accounts;
    }
}
