import java.util.*;
class S{
    int A;
    void area(int a ){

        A=a*a;
        System.out.println("area of square is "+A);
    }
    void perimeter(int b){
        A=4*b;
        System.out.println("perimeter of squre "+A);
    }
}
public class over {
    public static void main(String[] args) {
        
    
    S s=new S();
    s.area(4);
    s.perimeter(3);
    }
}
