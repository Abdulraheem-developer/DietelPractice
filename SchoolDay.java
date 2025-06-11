
class BackPack {
    private String item;
    private int quantity;

    public BackPack(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void describeBackpack() {
        if (quantity <= 0) {
            System.out.println("Backpack is empty? What are you going to do with your backpack empty?");
        } else {
            System.out.println("This backpack contains " + this.quantity + " " + this.item + "(s)");
        }
    }
}

// SchoolDay class with main method
public class SchoolDay {
    public static void main(String[] args) {
        BackPack content = new BackPack("Books", 13);
        content.describeBackpack();

        content.setItem("Laptop");
        content.setQuantity(3);
        content.describeBackpack();
    }
}
