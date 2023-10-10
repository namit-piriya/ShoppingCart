public class MainFile {
    public static void main(String[] args) {
        ItemStore myItemStore = new ItemStore();
        myItemStore.addItem(new Item(1, 50, "item 1", Category.BEAUTY));
        myItemStore.addItem(new Item(2, 50, "item 2", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(3, 50, "item 3", Category.BEAUTY));
        myItemStore.addItem(new Item(4, 50, "item 4", Category.BEAUTY));
        myItemStore.addItem(new Item(5, 50, "item 5", Category.BEAUTY));
        myItemStore.getItemStoreDetails();
        Cart myCart = new Cart(myItemStore);
        myCart.getCurrentCart();
        myCart.addItems(2);
        myCart.addItems(3);
        myCart.addItems(3);
        myCart.getCurrentCart();
        myCart.addItems(3);
        myCart.addItems(4);
        myCart.addItems(5);
        myCart.getCurrentCart();
        myCart.removeItem(2);
        myCart.getCurrentCart();
    }
}
