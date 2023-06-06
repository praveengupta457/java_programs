class outer{
    int a=10;
class inner{
    void get(){
        System.out.println("inner class "+a);
    }
}
    void show(){
        inner i=new inner();
        i.get();
    }

}
public class innout {
    public static void main(String[] args) {
        outer o=new outer();
        o.show();
    }
}
