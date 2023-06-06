// class A extends Thread{
//   public  void run(char ch){
      
//         for(ch='A';ch<='E';ch++){
//           try{
//             sleep(1000);
//             System.out.print(ch+" ");
//           }
//           catch(Exception e){
//             System.out.println(e);
//           }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         char ch;
//         for(ch='a';ch<='e';ch++){
//           try{
//             sleep(1000);
//             System.out.print(ch+" ");
//           }
//           catch(Exception e){
//             System.out.println(e);
//           }
//         }
//     }
// }
// public class tt{
//     public static void main(String[] args) {
//         A a=new A();
//         a.start();
//         B b=new B();
//         b.start();
//     }
// }
class table{
synchronized void print(int n){
for(int i=1;i<=10;i++){
  System.out.print(n*i+" ");
  try{
    Thread.sleep(1000);
  }
  catch(Exception e){
    System.out.println(e);
  }
 }
}
}
class Mythread extends Thread {
  table t;
  Mythread(table t)
  {
    this.t=t;
  }
  public void run(){
    t.print(7);
  }
}
class Mythread2 extends Thread{
  table t;
  Mythread2(table t){
    this.t=t;
  }
  public void run(){
    t.print(9);
  }
}
public class tt{
  public static void main(String[] args) {
    table obj=new table();
    Mythread t1=new Mythread(obj);
    Mythread2 t2=new Mythread2(obj);
    t1.start();
    t2.start();
  }
}