package ciepractice.inheritence;

public interface Interface {
    public void method1();
}

class MyMain implements Interface
{
    @Override
    public void method1() {
        System.out.println("Interface Overwritten");
    }
    public static void main(String[] args) {
        MyMain mm=new MyMain();
        mm.method1();
    }
}