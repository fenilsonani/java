// simple implementation of interface

interface A {
    void meth1();
    void meth2();
}

class B implements A {
    public void meth1() {
        System.out.println("Implementation of meth1.");
    }

    public void meth2() {
        System.out.println("Implementation of meth2.");
    }
}

class Interface {
    public static void main(String args[]) {
        B b = new B();

        b.meth1();
        b.meth2();

        // b = new A(); // error

        A a = new B();
        a.meth1();
        a.meth2();
    }
}