package Solutions;

public class SalesInvoice {

    public static void createInvoice(Object shoppingCart, int customerId) {
        // calculate total price
        // get customer data using customer Id
        // save to DB

        // print the invoice
        PrintingManager.print("printing data");

        // send invoice to customer email
        EmailService.send("email", "subject", "message");
    }
}
