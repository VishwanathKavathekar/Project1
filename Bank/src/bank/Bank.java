
package bank;
import java.util.*;
class BANK
{
    int person=101,acc,tot_bal,dep_amt;
    String name;
    Scanner s=new Scanner(System.in);
       int CreateAccount()
    {
        System.out.println("Enter the name ");
        name= s.next();
        System.out.println("Your Account no is"+person);
        person++;
        return person;
        
    }
    
    void Deposit_amt()
    {
        System.out.println("Enter your Account no");
        acc=s.nextInt();
        if(acc==person)         //validation
        {
            System.out.println("Enter your amount");
            dep_amt=s.nextInt();
            
            
        }
        else
        {
            System.out.println("Your Account no is INVAlID !!");
        }
    }
    void Withdraw_amt()
    {
        
    }
    void Transfer()
    {
        
    }
    void Balance_info()
    {
        
    }
}

public class Bank {
               
    public static void main(String[] args) 
    {
        int ch,no,i;
        System.out.println("***WElCOME***");
        for(i=0;i<5;i++)
        {
            BANK b[]= new BANK[i];
        }
        
       
        Scanner a= new Scanner(System.in);
        
        do
        {
            System.out.println("1.Creating account 2.Depositing amount 3.Withdrawing amount 4.Transfering account 5.Display Balance");
            System.out.println("Enter a choice");
            ch=a.nextInt();
            
            switch(ch)
            {
                case 1: no= b[i].CreateAccount();
                        break;
                case 2: b[i].Deposit_amt();
            }
        }
        
        
        
    }
    
}
