
  class A{
    int id;
    String name;
     static String college="DPU";
  
    public A (int a, String str){
     id=a;
    name=str;
    }
    void get(){
        System.out.println(name+" "+id+" "+college);
    }
    
    }

public class stateg{
    public static void main(String[] args) {
        A b=new A(12,"pradyumn");
        A b1=new A(13,"krishna");
        b.get();
        b1.get();
        
    }
}
