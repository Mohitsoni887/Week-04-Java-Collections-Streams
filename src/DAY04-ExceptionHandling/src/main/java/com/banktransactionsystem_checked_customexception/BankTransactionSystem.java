/*Bank Transaction System (Checked + Custom Exception)
        💡 Problem Statement:
        Develop a Bank Account System where:
        withdraw(double amount) method:
        Throws InsufficientBalanceException if withdrawal amount exceeds balance.
        Throws IllegalArgumentException if the amount is negative.
        Handle exceptions in main().
        Expected Behavior:
        If valid, print "Withdrawal successful, new balance: X".
        If balance is insufficient, throw and handle "Insufficient balance!".
        If the amount is negative, throw and handle "Invalid amount!".

 */
package com.banktransactionsystem_checked_customexception;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");
        } finally {
            scanner.close();
        }
    }
}

