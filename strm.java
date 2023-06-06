
// import java.util.*;
import java.io.*;
public class strm {
    public static void main(String[] args) {
        try{
            InputStreamReader ir= new InputStreamReader(System.in);

            BufferedReader br=new BufferedReader(ir);
            String str="";
            System.out.println("enter a character ");
            str=br.readLine();
            System.out.println("character is "+str);
        }
        catch(Exception e){
            System.out.println("cant read character");
        }
    }
}
