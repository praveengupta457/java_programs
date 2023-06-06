import java.util.Scanner;
import java.util.Vector;

public class aaaa {
    public static void main(String[] args) {
        Vector <Integer> v=new Vector<>();
        for(int i=1;i<=5;i++){
                v.add(i);
        }System.out.println("vector contains "+v);
              Scanner sc=new Scanner(System.in);
              System.out.println("enter number to add in vector");
              int j=sc.nextInt();
              v.add(j);
              System.out.println("appended vector is "+v);
              System.out.print("enter to remove the value");
        
              int n=sc.nextInt();
              v.remove(n);
              System.out.println("removed element is "+v);



}
}
