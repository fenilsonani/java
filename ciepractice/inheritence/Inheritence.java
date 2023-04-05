package ciepractice.inheritence;

class GradParent{
    public int idg;
    GradParent(){
        idg=0;
    }
    public void diplaydata1() {
        System.out.println("Grand Display Data");
    }
}

class Parent extends GradParent{
    public int id;
    Parent(){
        id=0;
    }
    public void diplaydata() {
        System.out.println("parent displaydata");
    }
}



// class to class extend
//interface to class implement
//interfdace to interface extend

public class Inheritence extends Parent {
    public static void main(String[] args) {
        Inheritence ih=new Inheritence();
        ih.diplaydata();
        ih.diplaydata1();
    }
}
