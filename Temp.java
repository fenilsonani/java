import java.util.StringTokenizer;

public class Temp {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Fenil Sonani");
        sb.append("please letter");
        System.out.println(sb);
        sb.insert(7, "Consider");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String str=new String("Belive in YourSelf.You are braver thatn you think,more talented than you know ,and capable of more than you imagine");
        StringTokenizer stk=new StringTokenizer(str,",");
        while(stk.hasMoreTokens()){
            System.out.println(stk.nextToken());
        }

        //count token
        System.out.println("Total token="+stk.countTokens());
    }
}
