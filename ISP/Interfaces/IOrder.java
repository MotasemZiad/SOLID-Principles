package ISP.Interfaces;

public interface IOrder extends ICashOrder, IInstallmentOrder, IOnlineOrder {
    // Interface AND Interface ===> extends

    void signCheck();
}
