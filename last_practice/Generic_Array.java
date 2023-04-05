import java.util.Arrays;

// Write a class which performs numerical operations. The constraint on this class is that it
// should accept only Number and its subtype of values. Then you add a constructor to this class
// which accepts multiple values for your operands and initializes the corresponding instance
// variable in your class. After this, you need to add a method which will return you a sorted list
// of the numbers. Then add yet another method to calculate the maximum value among them.


class GenericClass<T extends Number>{
    T[] t;
    public GenericClass(T[] t){
        this.t=t;
    }
    public T[] getA(){
        return t;
    }

    public void setA(T[] t){
        this.t=t;
    }

    public T[] sort(){
        for(int i=0;i<t.length;i++){
            for(int j=i+1;j<t.length;j++){
                if(t[i].doubleValue()>t[j].doubleValue()){
                    T temp=t[i];
                    t[i]=t[j];
                    t[j]=temp;
                }
            }
        }
        return t;
    }

    public T max(){
        T max=t[0];
        for(int i=1;i<t.length;i++){
            if(t[i].doubleValue()>max.doubleValue()){
                max=t[i];
            }
        }
        return max;
    }
}

class Generic_Sum_Array {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50,60,70,80,90,100};
        GenericClass<Integer> gc=new GenericClass<Integer>(arr);
        System.out.println(Arrays.toString(gc.getA()));
        gc.setA(arr);
        System.out.println(Arrays.toString(gc.getA()));
        System.out.println(Arrays.toString(gc.sort()));
        System.out.println(gc.max());
    }   
}