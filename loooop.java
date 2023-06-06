class thread1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(800);
            }
            catch(Exception e){
               System.out.println(e);
            }
            System.out.println(i);
        }
       // System.out.println("thread is running");
    }
    }
    public class loooop {
     public static void main(String[] args) {
        thread1 obj=new thread1();
        obj.start();
        thread1 t1=new thread1();
         t1.start();
    
     }   
    }
    