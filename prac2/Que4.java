package prac2;

// A book shop maintains the inventory of books that are been sold at the shop. The list
// includes the details such as BookTitle, Author, Price, Publisher & Stock position. 
// Whenever a customer wants to purchase a book, the sales person inputs the title and
// author to the system and the system searches the list & display whether it is available or
// not. If it is not, an appropriate message is displayed. If it is, then the system displays the
// book detail and request for the number of copies required. If the requested copies are
// available, the total cost of the requested copies is displayed; otherwise, the message
// "Required copies not in stock" is displayed. Design a system using a class called Books
// with suitable members and member functions & constructors. Use new operator in
// constructors to allocate memory space required do not use geters and setters.

import java.util.Scanner;

class Books {
    private String bookTitle;
    private String author;
    private int price;
    private String publisher;
    private int stockPosition;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        bookTitle = sc.nextLine();
        System.out.print("Enter author: ");
        author = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextInt();
        System.out.print("Enter publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter stock position: ");
        stockPosition = sc.nextInt();
    }

    void displayBook() {
        System.out.println("Book title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("Stock position: " + stockPosition);
    }

    void checkStock(int copies) {
        if (copies > stockPosition) {
            System.out.println("Required copies not in stock");
        } else {
            System.out.println("Total cost of the requested copies: " + (copies * price));
        }
    }

    public static void main(String[] args) {
        Books book = new Books();
        book.getData();
        book.displayBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of copies required: ");
        int copies = sc.nextInt();
        book.checkStock(copies);
    }

}