package bank;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

/**
 *
 * @author Vishwanath
 */
class Bank_application {

    int acc, dep_amt;
    static ArrayList<Account> arr = new ArrayList();
    int tot_bal;
    int count = 100;
    String name;
    Scanner s = new Scanner(System.in);

    void add_account(String name) {
        Account ac = new Account();
        ac.name = name;
        arr.add(ac);
        System.out.println("Your account no is " + count++);
    }

    void Deposit_amt() {
        System.out.println("Enter your Account no");
        acc = s.nextInt();
        if (arr.get(acc).name != null) //validation
        {
            System.out.println("Enter your amount");
            dep_amt = s.nextInt();
            arr.get(acc).tot_bal += dep_amt;

        } else {
            System.out.println("Your Account no is INVAlID !!");
        }
    }

    void Withdraw_amt() {
        System.out.println("Enter your Account no");
        acc = s.nextInt();
        while (arr.get(acc).name != null) {
            System.out.println("Enter the amount you want to deposit");
            dep_amt = s.nextInt();
            if (dep_amt > arr.get(acc).tot_bal) {
                System.out.println("You do not have enough balance");
            } else {
                arr.get(acc).tot_bal -= dep_amt;
            }
        }
        System.out.println("Wrong acc no");
    }

    void Transfer() {

    }

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
                    b.Deposit_amt();
                    break;
                case 3:
                    b.Withdraw_amt();
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
