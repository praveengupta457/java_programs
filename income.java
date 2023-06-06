import java.util.*;
interface job{
    int s=1000;
    void sallery();
}
class work implements job{
       //System.out.println("enter the days employee has worked");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1000;
    public void sallery(){
       System.out.println("sallery of employee is "+ s*n);
    } 
}

public class income{
    public static void main(String[] args) {
        
        
        work j=new work();
        j.sallery();
    }
}