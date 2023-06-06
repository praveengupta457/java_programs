import java.util.*;
class VotingException extends Exception{
    VotingException(String str){
        super(str);
    }
}
public class user{
    public static void main(String[] args) {
        int age=16;
        try{
        if(age<18){
            throw new VotingException("you cant drive");
        }
            else{
            System.out.println("you can drive");
        }
    }
    catch(VotingException ve){
       ve.printStackTrace();
    }
    
    }
}