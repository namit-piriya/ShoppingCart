import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class ItemStore {

    ArrayList<Item> items = new ArrayList<>();

    HashMap<Integer, Integer> totalItems = new HashMap<>();


    HashMap<Integer, Integer> getTotalItems() {
        return totalItems;
    }

    void addItem(Item addItem) {
        Stream<Item> item = items.stream().filter(i -> i.id == addItem.id);
        if (item.findAny().isEmpty()) {
            items.add(addItem);
            totalItems.put(addItem.id, 1);
        }
        var currValue = totalItems.get(addItem.id);
        totalItems.put(addItem.id, currValue + 1);
    }

    void removeItem(Integer id) {
        int currItemVal = totalItems.getOrDefault(id, 0);
        if (currItemVal == 1) {
            items.removeIf(item -> item.id == id);
        }
        totalItems.put(id, currItemVal - 1);
    }

    Item getItem(Integer id) {
        var item = items.stream().filter(i -> i.id == id).findFirst().stream().toArray();
        if (item.length < 1) {
            return null;
        }
        return (Item) item[0];
    }

    void getItemStoreDetails() {
        for (var keyEntry : totalItems.entrySet()) {
            Integer key = keyEntry.getKey();
            var name = getItem(key).name;
            var count = keyEntry.getValue();
            System.out.println("id " + getItem(key).id + "Item name " + name + " count" + count);
        }

    }

}
