class BankAccount {
    int balance = 5000;

    void withdraw(int amount) throws Exception {

        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance!");  // throw
            }

            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balance);
        }

        catch (Exception e) {   // catch
            System.out.println("Error: " + e.getMessage());
            throw e;            // rethrow (optional)
        }

        finally {               // finally
            System.out.println("Transaction Finished.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(7000);       // More than balance → exception
        }
        catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
