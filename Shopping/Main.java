package Shopping;

public class Main {
    public static void main(String[] args) {
        try {
            TV tv = new TV(15000);
            Notebook notebook = new Notebook(85000);
            SmartPhone smartphone = new SmartPhone(65000);
            Payment pay = new Payment("Petros Petrosyan", 120000, CardType.VISA);
            Shopping shop = new Shopping(pay);

            pay.addItemToBasket(tv);
            pay.addItemToBasket(tv);
            pay.addItemToBasket(notebook);
            pay.addItemToBasket(smartphone);

            shop.purchaseItems();
        } catch (DuplicateItemException | InsufficientBalanceException | GiftLimitExceededException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
