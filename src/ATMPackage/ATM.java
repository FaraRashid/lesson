/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMPackage;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author izyan rosni
 */
public class ATM extends Account {
    
    
    
   
    public ATM(String customerName, int id) {
        super(customerName, id);
    }

    public ATM() 
    {}

    
   
    
    public void displayMenu(Account account) {
        int num = 0;
       String s2;
        String s3;
        String s4;
        boolean error = false;
        while (num != 4) {
            Scanner input = new Scanner(System.in);
          s2 = JOptionPane.showInputDialog ("Please choose what you'd like to do: \n Main Menu \n 1: Account info \n 2: Withdraw \n 3: Deposit \n 4: Exit \n");
     
   // "You are a " + grade,
   // "Your Name is " + First_name,
   // "Your Last Name is " + Last_name
//};
//JOptionPane.showMessageDialog (null, message);
            try {
             num = Integer.parseInt(s2);
                if (num == 1) {
                    //Print account info
                       String[] message = {
                           "\nCustomer :" + account.getCustomerName(),
                           "\nAccount Number :" + account.getAccountnumber(),
                           "\nAccount Banlance:" + account.getBalance(),
                           "\nMonthly interest earned:" + account.getMonthlyInterest()
                       };
                       JOptionPane.showMessageDialog (null, message);
                       
             //  JOptionPane.showMessageDialog( null, "\nCustomer: %s \nAccount Number :%d \nAccount Banlance: $%.2f \nMonthly interest earned: $%.2f \n" , account.getCustomerName(),account.getAccountnumber(),  account.getBalance() ,account.getMonthlyInterest());
                } else if (num == 2)
                  
                {
                    //Asking for an amount the customer want to withdraw.
                    do {
                 s3 = JOptionPane.showInputDialog ("\nEnter the amount to withdraw: ");

                         
                        try {
                            error = false;  
                            double withdraw = Double.parseDouble(s3);
                            account.withdraw(withdraw);
                        } catch (NumberFormatException ex) {
                            error = true;
                            JOptionPane.showMessageDialog( null,  "\n*******Please enter a valid number*******");
                        } catch (IllegalArgumentException ex) {
                            error = true;
                            JOptionPane.showMessageDialog( null,  ex.getMessage());
                        }
                    } while (error);
                } else if (num == 3) {
                    //Asking for an amount the customer want to deposit.
                    do {
                        s4 = JOptionPane.showInputDialog  ("\nEnter the amount to deposit: ");

                        try {
                            error = false;
                            double deposit = Double.parseDouble(s4);
                            account.deposit(deposit);
                        } catch (NumberFormatException ex) {
                            error = true;
                           JOptionPane.showMessageDialog( null, "\n*******Please enter a valid number*******");
                        } catch (IllegalArgumentException ex) {
                            error = true;
                           JOptionPane.showMessageDialog( null, ex.getMessage());
                        }
                    } while (error);
                } else if (num == 4) {
                    return;
                } else {
                    //If the customer input number is not 1, 2, 3, or 4, 
                       JOptionPane.showMessageDialog( null, "\n*******Please enter a valid number*******");
                }
                //Catch the input is not a number.    
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog( null,"\n*******Please enter a valid number*******");
                displayMenu(account);
                break;
            }
        }

    }

}


