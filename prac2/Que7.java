package prac2;

// Consider the shopping cart class with all the data members related to cart. If user shops
// for the first time item count should be zero initially. If user adds items to the cart, item
// should be added to the item list. At the end generate the bill and display total number of
// item purchased till date. (Use constructor and static variable)


import java.util.Scanner;

class ShoppingCart {
    private static int itemCount = 0;
    private static int total = 0;
    private String[] itemList = new String[10];

    public ShoppingCart() {
        itemCount = 0;
        total = 0;
    }

    public void addItem(String item, int price) {
        itemList[itemCount++] = item;
        total += price;
    }

    public void generateBill() {
        System.out.println("Item list: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemList[i]);
        }
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item = sc.nextLine();
            System.out.print("Enter item price: ");
            int price = sc.nextInt();
            cart.addItem(item, price);
        }
        cart.generateBill();
    }
}