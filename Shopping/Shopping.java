package Shopping;

import java.util.Arrays;

public class Shopping {
    private Payment payment;

    public Shopping(Payment payment) {
        this.payment = payment;
    }

    public void purchaseItems() {
        int balance = payment.getBalance();
        int itemsPrice = payment.getItemsPrice();
        if (balance - itemsPrice < 0) {
            throw new RuntimeException("Balance is not enough to buy items");
        }
        if (payment.getGifts().length > 1 && !payment.checkGiftsInList()) {
            throw new RuntimeException("Customer can have only one gift");
        }
        payment.setBalance(balance - itemsPrice);
        System.out.println(payment.getName() + " purchased items " + payment.getBasket() + "Balance:" + balance + " - " + itemsPrice + " = " + payment.getBalance());
        System.out.println("Customer also has gift:" + Arrays.toString(payment.getGifts()));
    }


}
