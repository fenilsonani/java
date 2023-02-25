package prac2;

// Consider the shopping cart class with all the data members related to cart. If user shops
// for the first time item count should be zero initially. If user adds items to the cart, item
// should be added to the item list. At the end generate the bill and display total number of
// item purchased till date. (Use constructor and static variable)


import java.util.Scanner;

class Cart{

    static int itemCount = 0;
    String[] itemList = new String[10];
    int[] itemPrice = new int[10];
    int total = 0;

    Cart(){
        itemCount = 0;
    }

    void addItem(String item, int price){
        itemList[itemCount] = item;
        itemPrice[itemCount] = price;
        itemCount++;
    }

    void generateBill(){
        System.out.println("Item\tPrice");
        for(int i=0; i<itemCount; i++){
            System.out.println(itemList[i]+"\t"+itemPrice[i]);
            total += itemPrice[i];
        }
        System.out.println("Total\t"+total);
    }

    static void displayItemCount(){
        System.out.println("Total items purchased till date: "+itemCount);
    }

}

class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart c = new Cart();
        int choice;
        do{
            System.out.println("1. Add item to cart");
            System.out.println("2. Generate bill");
            System.out.println("3. Display total items purchased till date");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.next();
                    System.out.print("Enter item price: ");
                    int price = sc.nextInt();
                    c.addItem(item, price);
                    break;
                case 2:
                    c.generateBill();
                    break;
                case 3:
                    Cart.displayItemCount();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 4);
        sc.close();
    }
}