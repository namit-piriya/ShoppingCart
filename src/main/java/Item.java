public class Item {
    int id;
    // id is unique
    int amount;
    String name;

    Category category;

    public Item(int id, int amount, String name, Category category) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.category = category;
    }
}


