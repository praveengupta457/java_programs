class A{
    int x=10;

     A(){
        System.out.println("radhe");
     }

    void show(){
        System.out.println("hello");
    }
}
class B extends A {
    int x=20;
    B(){
        super();                               // envokked parent class constructor
        System.out.println("hare krishna");
    }
    void dis(){
        super.show();                      // envokked parent classs method
        System.out.println(x);
        System.out.println(super.x);       // envoked parent class instance variable

    }
}
public class spr {
    public static void main(String[] args) {
        B b=new B();
        b.dis();
    }
}
