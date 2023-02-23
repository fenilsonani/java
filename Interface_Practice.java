interface Interface_Practice {
    public void method1();
    public void method2();
}

class Class1 implements Interface_Practice {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }
}

class Class2 implements Interface_Practice {
    public void method1() {
        System.out.println("Method 11");
    }

    public void method2() {
        System.out.println("Method 22");
    }
}

class Interface_Practice1 {
    public static void main(String[] args) {
        Interface_Practice c1 = new Class1();
        Interface_Practice c2 = new Class2();
        c1.method1();
        c1.method2();
        c2.method1();
        c2.method2();
    }
}
