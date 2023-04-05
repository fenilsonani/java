// Write a JAVA program that generate multiple threads to perform given independent tasks.
// Each thread is responsible for performing a different operations. After each thread has
// completed its operation, the program should collect the results from all threads and aggregate
// them to produce a final output.
// Ans= mux(num) + cubeEach(num)+ fact(num)
// Where mux() is responsible to separate each digit and perform multiplication.
// cubeEach() is responsible to separate each digit, perform cube on each digit and make
// addition.
// fact() is responsible to calculate factorial of given number


class Thread1 extends Thread{
    int num;
    public Thread1(int num){
        this.num=num;
    }
    public void run(){
        int sum=1;
        for(int i=1;i<=num;i++){
            sum*=i;
        }
        System.out.println("Factorial of "+num+" is "+sum);
    }
}

class Thread2 extends Thread{
    int num;
    public Thread2(int num){
        this.num=num;
    }
    public void run(){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        System.out.println("Cube of each digit is "+sum);
    }
}

class Thread3 extends Thread{
    int num;
    public Thread3(int num){
        this.num=num;
    }
    public void run(){
        int sum=1;
        while(num>0){
            int rem=num%10;
            sum*=rem;
            num/=10;
        }
        System.out.println("Multiplication of each digit is "+sum);
    }
}

class MultiThreaed{
    public static void main(String[] args) {
        Thread1 t1=new Thread1(5);
        Thread2 t2=new Thread2(123);
        Thread3 t3=new Thread3(123);
        t1.start();
        t2.start();
        t3.start();
    }
}