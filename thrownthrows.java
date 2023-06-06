import java.io.IOException;
class thrs{
   
    void show() throws IOException  //use of throws 
    {
        throw new IOException("error");    //use of throw
    }
    void display(){
        try{
            show();
        }
        catch(Exception e){

            System.out.println("exception handled");
        }
    }
}
public class thrownthrows {
    public static void main(String[] args) {
        
        thrs th=new thrs();
        th.display();
        System.out.println("normal flow");
    }
}
