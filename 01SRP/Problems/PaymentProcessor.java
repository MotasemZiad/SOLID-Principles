package SRP.Problems;

public class PaymentProcessor {

    public PaymentProcessor() {
    }

    // This class violates single responsibility principle.
    // The S.R.P should be applied in class or even methods.
    // We should move the last three methods to new classes.

    public void charge(double amount) {
        // Initialize bank data
        // Send request to the bank
    }

    // Not for this class
    public String createReport() {
        // Format a report
        return "";
    }

    // Not for this class
    public void printReport() {
        // Send printing commands
    }

    // Not for this class
    public void savePayment() {
        // Saving to DB
    }
}
