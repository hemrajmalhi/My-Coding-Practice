
package HackerRank;
import java.util.*;
public class Pro_15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String a1=A.substring(0,1).toUpperCase()+A.substring(1);
        String b1=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(a1+" "+b1);



    }
}



