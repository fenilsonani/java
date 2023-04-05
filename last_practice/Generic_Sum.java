// Write a program to create generic class to perform addition of two values.
// Values can be of any data type. In case of String data type it should perform concatenation.

class GenericClass<T>{
    T t;
    public GenericClass(T t){
        this.t=t;
    }
    public T getA(){
        return t;
    }

    public void setA(T t){
        this.t=t;
    }

    public <T extends Number>  T add(T a,T b){
        if(a instanceof Integer){
            return (T)(Integer)(a.intValue()+b.intValue());
        }
        else if(a instanceof Double){
            return (T)(Double)(a.doubleValue()+b.doubleValue());
        }
        else if(a instanceof Float){
            return (T)(Float)(a.floatValue()+b.floatValue());
        }
        else if(a instanceof Long){
            return (T)(Long)(a.longValue()+b.longValue());
        }
        else{
            return null;
        }
    }

    public <T extends String>  T add(T a,T b){
        System.out.println("String is a "+a.toString()+" "+b.toString());
        return (T)(a.toString()+b.toString());
    }

}

public class Generic_Sum {
    public static void main(String[] args) {
        GenericClass<Integer> gc=new GenericClass<Integer>(10);
        System.out.println(gc.getA());
        gc.setA(20);
        System.out.println(gc.getA());
        System.out.println(gc.add(10,20));
        System.out.println(gc.add(10.5,20.5));
        System.out.println(gc.add(10.5f,20.5f));
        System.out.println(gc.add(10l,20l));
        System.out.println(gc.add((short)10,(short)20));
        System.out.println(gc.add((byte)10,(byte)20));
        System.out.println(gc.add("Fenil","Sonani"));
    }   
}
