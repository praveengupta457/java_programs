class thread1 extends Thread{
    public void run() {
        System.out.println("thread running");
        
    }
}
public class threadDemo {
    public static void main(String[] args) {
        thread1 t= new thread1();
        t.start();
        thread1  t1 =new thread1();
        t1.start();   // main is the first thread and t2 is second thread
    }
}
