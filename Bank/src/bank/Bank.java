package bank;

import java.util.*;
import java.util.ArrayList;

/**
 *This program illustrates working of banking application
 * This program gives functionalities like add account,deposit ,withdrawal,Displaying the account
 * @author Vishwanath
 */
class Bank_application {
;
    int acc, dep_amt,with_amt;
    static ArrayList<Account> arr = new ArrayList();
    int tot_bal;
    int count = 100;
    String name,name2;
    Scanner s = new Scanner(System.in);
    Account ac;
    /**
     * This method creates multiple accounts
     * @param name User enters a input which is being passed in the add_account function
     * @param count Gives the user an unique account no which increments after every new account is created
     */
    void add_account(String name) {
        Account obj1 = new Account();
        obj1.name = name;
          arr.add(obj1);
        System.out.println("Your account no is " +count);
        count++;
    }
    /**
     * This method lets the users deposit money in their respective accounts 
     * @param acc User enters a account no which is being passed for validation 
     * @param tot_bal The total balance of each user is present 
     */
    void Deposit_amt(int acc) {
      
        
        if (acc<count &&arr.get(acc).name!=null ) //validation
        {
            System.out.println("Enter your amount");
            dep_amt = s.nextInt();
            arr.get(acc).tot_bal += dep_amt;

        } else {
            System.out.println("Your Account no is INVAlID !!");
        }
    }
/**
 * This method lets the users to withdraw an amount from their existing balance and makes the necessary changes to their total balance
 * @param with_amt contains the amount the user wants to withdraw
 * 
*/
    
    void Withdraw_amt() {
        System.out.println("Enter your Account no");
        acc = s.nextInt();
        while (arr.get(acc).name != null) {
            System.out.println("Enter the amount you want to deposit");
            with_amt = s.nextInt();
            if (with_amt > arr.get(acc).tot_bal) {
                System.out.println("You do not have enough balance");
            } else {
                arr.get(acc).tot_bal -= with_amt;
            }
        }
        System.out.println("Wrong acc no");
    }

  
/**
 * This method displays the the total balance of an individual
 */
    void Balance_info() {
        System.out.println("Enter your Account no");
        acc = s.nextInt();
        if (arr.get(acc).name != null) {
            System.out.println("Your balance is" + arr.get(acc).tot_bal);
        }
        System.out.println("Wrong account no");

    }

}

public class Bank {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        int ch, no = 0, i, count = 100, flag;
        String name;
        System.out.println("***WElCOME***");

        Bank_application b = new Bank_application();

        Scanner a = new Scanner(System.in);

        do {
            System.out.println("1.Creating account 2.Depositing amount 3.Withdrawing amount 4.Transfering account 5.Display Balance");
            System.out.println("Enter a choice");
             ch = a.nextInt();
            flag = no;
            switch (ch) {
                case 1:
                    System.out.println("Enter your name");
                    name = a.next();
                    b.add_account(name);

                    break;
                case 2:
                      System.out.println("Enter your Account no");
                      int accountno1=a.nextInt();
                    b.Deposit_amt(accountno1);
                    break;
                case 3: b.Withdraw_amt();
                    break;
                case 4:
                    b.Balance_info();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (ch < 5);

    }

}
