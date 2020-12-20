
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anhnbt
 */
public class TransferManager implements Runnable {

    private double amount;
    private final CustomerAccount from;
    private final CustomerAccount to;

    public TransferManager(double amount, CustomerAccount accFrom, CustomerAccount accTo) {
        this.amount = amount;
        this.from = accFrom;
        this.to = accTo;
    }

    @Override
    public void run() {
        try {
            synchronized (from) {
                if (from.getBalance() > getAmount()) {
                    // transfer
                    Thread.sleep(3000);
                    from.setBalance(from.getBalance() - getAmount());
                    to.setBalance(to.getBalance() + getAmount());
                    System.out.println("Transfer from " + from.getAccountType() + " to "
                            + to.getAccountType() + " completed.");
                } else {
                    // not enough money
                    System.out.println("Transfer from " + from.getAccountType() + " to "
                            + to.getAccountType() + " NOT completed.");
                }
                System.out.println("Information after transfer");
                System.out.println(from.toString());
                System.out.println(to.toString());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TransferManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
