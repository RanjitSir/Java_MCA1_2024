import java.lang.*;
import java.util.*;

// Custom Exception for Insufficient Funds
class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String message) 
	{
        super(message);
    }
}

// Custom Exception for Negative Amount
class NegativeAmountException extends Exception 
{
    public NegativeAmountException(String message) 
	{
        super(message);
    }
}

// Bank Account class
class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
	{
        if (initialBalance < 0) 
		{
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException 
	{
        if (amount < 0) 
		{
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("\n Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException 
	{
        if (amount < 0) 
		{
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) 
		{
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
        System.out.println("\n Withdrew: " + amount);
    }

    public double getBalance() 
	{
        return balance;
    }
}

// Main class
public class BankApp 
{
    public static void main(String[] args) 
	{
        BankAccount account = new BankAccount(1000);

        try 
		{
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(1500); // This will cause InsufficientFundsException
        } 
		catch (InsufficientFundsException | NegativeAmountException e) 
		{
            System.out.println("\n Exception: " + e.getMessage());
        }

        try 
		{
            account.deposit(-100); // This will cause NegativeAmountException
        } 
		catch (NegativeAmountException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\n Current Balance : " + account.getBalance());
    }
}
