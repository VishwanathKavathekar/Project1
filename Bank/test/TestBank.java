/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vishwanath
 */
public class TestBank {
     Bank_application b;
    public TestBank() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Bank_application b=new Bank_application();
    }
    
    @After
    public void tearDown() {
    }

   
     @Test
    public void add_account() {
    assertEquals(1,b.add_account("abcd"));
    assertEquals(101,b.add_account("efgh"));
    }
     public void testDeposite() {
         {
        assertEquals(5000,b.deposit(100,5000));
        assertEquals(2000,b.deposit(101,2000));
         }
    }
       @Test
    public void testWithdraw() {
    {    
         assertEquals(2000,b.withdraw(100,2000));
         assertEquals(500,b.withdraw(101,500));
    }
    }
    
    public void testTransfer() {
    {    

        assertEquals(1000,b.transfer(100,101,1000));
    }
    }
}
