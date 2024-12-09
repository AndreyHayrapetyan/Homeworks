package Shopping;

public class Payment extends Basket {
    private String name;
    private int balance;
    private CardType cardType;

    public Payment(String name, int balance, CardType cardType) {
        super();
        this.name = name;
        this.balance = balance;
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
