/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anhnbt
 */
public class CustomerAccount {
    private String accountType;
    private double balance;

    public CustomerAccount(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }
    
    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" + "accountType=" + accountType + ", balance=" + balance + '}';
    }
    
}
