package testingbanking;

import com.banking.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(100.0); // Initialize with 100
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(50.0);
        assertEquals(150.0, bankAccount.getBalance(), "Balance should be updated correctly after deposit.");
    }

    @Test
    void testWithdraw() {
        bankAccount.withdraw(30.0);
        assertEquals(70.0, bankAccount.getBalance(), "Balance should be updated correctly after withdrawal.");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(200.0));
        assertEquals("Insufficient funds", exception.getMessage(), "Should throw an exception for insufficient balance.");
    }

    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-10.0));
        assertEquals("Deposit amount must be positive", exception.getMessage(), "Should throw an exception for negative deposit.");
    }

    @Test
    void testNegativeWithdrawal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-5.0));
        assertEquals("Withdrawal amount must be positive", exception.getMessage(), "Should throw an exception for negative withdrawal.");
    }

    @Test
    void testInitialBalanceCannotBeNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-50.0));
        assertEquals("Initial balance cannot be negative", exception.getMessage(), "Should not allow negative initial balance.");
    }
}
