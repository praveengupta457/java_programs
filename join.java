class thread1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(800);
                System.out.println(this.getName()+"  "+i);
            }
            catch(Exception e){
               System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("thread is running");
    }
    }
    public class join{
     public static void main(String[] args) {
        thread1 obj=new thread1();
        obj.start();
        System.out.println(Thread.currentThread().getName());
        try{
            obj.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        thread1 t1=new thread1();
        t1.start();
    
     }   
    }
    