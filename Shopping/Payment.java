package Shopping;

public class Payment extends Basket {
    private String name;
    private int balance;
    private String cardType;

    public Payment(String name, int balance, String cardType) {
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

    public String getCardType() {
        return cardType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}