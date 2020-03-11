/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMPackage;
import ATMPackage.ATM;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author izyan rosni
 */
public class MainATM {
       public static void main(String[] args) {
   
          
        //Make two bank accounts
        Account account1 = new Account("NURIZYAN AMIRA BT ROSNI", 12345);
        Account account2 = new Account("NAIM BIN TARMIZI", 67891);
        Account account3 = new Account("NAIM BIN ROSLAN", 43345);
        //Set the balance of account1 and account2
        account1.setBalance(20000);
        account2.setBalance(30000);
        account3.setBalance(40000);
        //account number
        account1.setAccountnumber(123439943);
        account2.setAccountnumber(454563445);
        account3.setAccountnumber(232463249);
        //Set the annual interest rate of account1 and account2
        account1.setAnnualInterestRate(5);
        account2.setAnnualInterestRate(5);
         account3.setAnnualInterestRate(5);
         
         String s1;
        int id = 1;
        while (true) {
              s1 = JOptionPane.showInputDialog("Enter an account ID: ");

            try {
            
              id = Integer.parseInt(s1);
           //     id = Integer.parseInt(s1);
                ATM atm = new ATM();
                //The ID has to be 67891, 12345, and 43345
                if (id == 12345) {
                    atm.displayMenu(account1);
                   } else if (id == 67891) {
                    atm.displayMenu(account2);
                } else if (id ==  43345) {
                    atm.displayMenu(account3);
            
                        
                } else {
                    //If the customer input number is not 101 or 102,
                 JOptionPane.showMessageDialog(null,"\n*******Please enter a valid number*******");
                }

                //Catch the input is not a number.
            } catch (Exception ex) {
              JOptionPane.showMessageDialog(null,  "\n*******Please enter a valid number*******");
            }

        }
        
        
    }

       }
    

