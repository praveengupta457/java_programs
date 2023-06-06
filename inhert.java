class student {
    int a=100;
 void get(){
    System.out.println("primary class");
 }
}
class stu extends student{
    void display(){
        this.get();
        System.out.println (super.a);
     System.out.println("extended class");
    }
}
public class inhert{
    public static void main(String[] args) {
        stu st=new stu();
        st.display();
    }
}