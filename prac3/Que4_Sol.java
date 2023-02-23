package prac3;

// Create a class inventory that contains data members like item id, item name, price,
// stock. Create two more classes which is inherit from inventory class namely purchase
// and sales. Upon purchase and selling of the items stock should be updated. Implement
// the functionality of a re-order level while selling of an items (Message should be
// displayed if item reaches to re-order level) as well as it stock should be checked before
// selling otherwise proper message should be displayed. More than one item should be
// sale at a time.

class Inventory {
    int itemId, price, stock;

    Inventory(int itemId, int price, int stock) {
        this.itemId = itemId;
        this.price = price;
        this.stock = stock;
    }

    int getItemId() {
        return itemId;
    }

    int getPrice() {
        return price;
    }

    int getStock() {
        return stock;
    }

    void setItemId(int itemId) {
        this.itemId = itemId;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setStock(int stock) {
        this.stock = stock;
    }
}

class Purchase extends Inventory {
    int quantity;

    Purchase(int itemId, int price, int stock, int quantity) {
        super(itemId, price, stock);
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void purchase() {
        stock = stock + quantity;
    }
}

class Sales extends Inventory {
    int quantity;

    Sales(int itemId, int price, int stock, int quantity) {
        super(itemId, price, stock);
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void sale() {
        if (stock < quantity) {
            System.out.println("Not enough stock");
        } else {
            stock = stock - quantity;
            if (stock < 10) {
                System.out.println("Re-order level reached");
            }
        }
    }
}

public class Que4_Sol {
    public static void main(String[] args) {
        Purchase p = new Purchase(1, 100, 10, 10);
        p.purchase();
        System.out.println("Stock: " + p.getStock());
        Sales s = new Sales(1, 100, 20, 10);
        s.sale();
        System.out.println("Stock: " + s.getStock());
    }
}