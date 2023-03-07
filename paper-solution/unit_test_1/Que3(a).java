class Vehical{
    int vehical_id;
    public void gear(){
        System.out.println("Gear");
    }
}

interface drive{
    public void gear();
    public void steering();
}

class maruti_800 extends Vehical implements drive{
    String m_num,cname;
    public void steering(){
        System.out.println("Normal Steering");
    }
    public void gear(){
        System.out.println("5 Number Of Gear");
    }
}

class viteraBrezza extends Vehical implements drive{
    String m_num,cname;
    public void steering(){
        System.out.println("Power Steering");
    }
    public void gear(){
        System.out.println("6 Number Of Gear");
    }
}

class Controllclass{
    public static void main(String[] args) {
        maruti_800 obj1 = new maruti_800();
        viteraBrezza obj2 = new viteraBrezza();
        obj1.gear();
        obj1.steering();
        obj2.gear();
        obj2.steering();
    }
}