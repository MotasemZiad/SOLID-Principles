package ISP;

public interface IOrder {
    void ProcessCashInvoice();

    void ProcessCreditInvoice();

    void ProcessOnlinePaymentInvoice();

    void ProcessInstallmentInvoice();
}
