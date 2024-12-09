package Shopping;

import java.util.Arrays;

public class Basket {
    private Item[] basket;
    private Item[] gifts;

    public Basket() {
        this.basket = new Item[0];
        this.gifts = new Item[0];
    }

    public void addItemToBasket(Item item) {
        for (Item basketItem : basket) {
            if (basketItem == item) {
                throw new DuplicateItemException("Item already exists in the basket: " + item.getBrand());
            }
        }
        Item[] newList = Arrays.copyOf(basket, basket.length + 1);
        newList[newList.length - 1] = item;
        basket = newList;

        Item gift;
        if (item instanceof TV || item instanceof Notebook) {
            gift = item instanceof TV ? new SmartPhone(85000) : new HairDryer(28000);
            addGiftToGiftList(gift, item.getId());
        }
    }

    public int getItemsPrice() {
        int price = 0;
        for (Item item : basket) {
            price += item.getPrice();
        }
        return price;
    }

    public String[] getGifts() {
        String[] giftsList = new String[gifts.length];
        for (int i = 0; i < gifts.length; i++) {
            giftsList[i] = "[Item:" + gifts[i].getBrand() + ", ID:" + gifts[i].getId() + ", Price:" + gifts[i].getPrice() + "]";
        }
        return giftsList;
    }

    public boolean checkGiftsInList() {
        return gifts.length > 1;
    }

    public void addGiftToGiftList(Item gift, int id) {
        if (gifts.length >= 1) {
            throw new GiftLimitExceededException("Customer can have only one gift.");
        }
        Item[] newList = Arrays.copyOf(gifts, gifts.length + 1);
        gift.setId(id);
        newList[newList.length - 1] = gift;
        gifts = newList;
    }

    public void deleteGiftFromGiftList(int id) {
        boolean found = false;
        Item[] newList = new Item[gifts.length - 1];
        int index = 0;

        for (Item gift : gifts) {
            if (gift.getId() != id) {
                if (index < newList.length) {
                    newList[index++] = gift;
                }
            } else {
                found = true;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Gift with ID " + id + " not found.");
        }

        gifts = newList;
    }

    public String getBasket() {
        String[] itemsList = new String[basket.length];
        for (int i = 0; i < basket.length; i++) {
            itemsList[i] = "[Item:" + basket[i].getBrand() + ", ID:" + basket[i].getId() + ", Price:" + basket[i].getPrice() + "]";
        }
        return Arrays.toString(itemsList);
    }
}
