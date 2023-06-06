class thread1 extends Thread{
    public void run(){
       for(int i=1;i<5;i++){
            try{

               if(Thread.currentThread().isDaemon()){
                System.out.println("daemon");
               }
               else{
                System.out.println("not daemon");
               }
            }
   
            catch(Exception e){
               System.out.println(e);
            }
            System.out.println(i);
         }
    }
   }
    public class demon{
     public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.setDaemon(true);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    
        thread1 t2=new thread1();
        t2.start();
    
     }   
    }
    