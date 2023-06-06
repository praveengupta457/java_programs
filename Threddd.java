// class thread1 implements Runnable{
// public void run(){
//     System.out.println("abcd efgh ijkl mnop qrstuv");
// }
// }
// public class Threddd {
//  public static void main(String[] args) {
//     thread1 obj=new thread1();
// Thread t1 =new Thread(obj); //boundation is being processed in Thread main object
// t1.start();
// Thread t2=new Thread("this is this");
// String str=t1.getName();
// System.out.println("t1 thread name "+str);
// // String str1=t2.getName();
// // System.out.println("the name of t2 is "+str1);

//  }   
// }
import java.util.*;
import java.io.*;
class odd extends Thread{
    int n;
    public void run(){
        for(int i=1;i<+n;i=i+2){
          try{
            sleep(1000);
            System.out.println(i);
          }
          catch(Exception e){
            System.out.println(e);
          }
        }
    }
}
class Threddd{
    public static void main(String[] args) {
        odd o=new odd();
        o.start();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for count");
        int n=sc.nextInt();
    }
}
