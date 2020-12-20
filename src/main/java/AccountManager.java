/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anhnbt
 */
public class AccountManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerAccount A = new CustomerAccount("A", 1000);
        CustomerAccount B = new CustomerAccount("B", 2000);
        CustomerAccount C = new CustomerAccount("C", 3000);
        Runnable r1 = new TransferManager(600, A, B);
        Runnable r2 = new TransferManager(800, A, C);
        System.out.println("Information before transfer");
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        Thread thObj1 = new Thread(r1);
        Thread thObj2 = new Thread(r2);
        // Starting a thread
        thObj1.start();
        thObj2.start();
    }
    
    
}
