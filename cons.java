
class A{
    int a=10;
    A()  //deafault constructor
    {
        System.out.println(a);
    }
    A(int x)    // pRmeterised  constructor
    {
        System.out.println(x);
    }
}
public class cons {
    public static void main(String[] args) {
         A a=new A();
         A b=new A(4);
    }
}
