package Activity;

import activity.BankAccount;
import activity.NotEnoughFundsException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {
    @Test
    public void notEnoughFunds() {
        //object for class BankAccount
        BankAccount bankAccount = new BankAccount(10);
        //Assert to throw the exception
        System.out.println(assertThrows(NotEnoughFundsException.class, () -> bankAccount.withdraw(11),
                "Balance must be greater than amount of withdrawal"));
      //  System.out.println("Not Enough Balance");
    }

    @Test
    public void enoughFunds() {
        BankAccount bankAccount = new BankAccount(100);
      //  System.out.println(bankAccount.withdraw(40));
       System.out.println(assertDoesNotThrow(()->bankAccount.withdraw(60),
                "User has enough balance"));



    }
}
