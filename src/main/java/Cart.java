import java.util.HashMap;

public class Cart {

    HashMap<Integer, Integer> cart = new HashMap<>();
    ItemStore store;

    public Cart(ItemStore store) {
        this.store = store;
    }

    void removeItem(Integer id) {
        var curr = cart.getOrDefault(id, 0);
        if (curr == 0) {
            return;
        }
        cart.put(id, curr - 1);
        store.addItem(store.getItem(id));
    }

    void addItems(Integer id) {
        var curr = cart.getOrDefault(id, 0);
        cart.put(id, curr + 1);
        store.removeItem(id);
    }

    void getCurrentCart() {
        for (var entry : cart.entrySet()) {
            var curr = entry.getKey();
            Item item = store.getItem(curr);
            System.out.println("Item is " + item.name + " and quantity " + entry.getValue());
        }
    }

}
