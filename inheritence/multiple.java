interface printable {
    void print();
}

interface myshow{
    void show();
}

class A6 implements printable, myshow {
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
        obj.show();
    }
}