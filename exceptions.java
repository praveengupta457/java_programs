
// file not found exception
import java.io.File;
import java.io.FileReader;

public class exceptions {
    public static void main(String[] args) {
        File f= new File("D:\\Java\\sample.txt");
        try{
            FileReader fr=new FileReader(f);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
