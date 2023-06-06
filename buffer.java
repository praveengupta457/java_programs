public class buffer {
    public static void main(String[] args) {
        
        StringBuffer str= new StringBuffer("welcome to vs code");
        System.out.println("original buffer is..."+str +"....with the lenght of "+str.length());
        str.append("   this is your first program of string");
        System.out.println("   appanded list is "+str+"   with length of "+str.length());
        str.insert(2,"....ram....");
        System.out.println("");
System.out.println("inserted  "+str);
        // str.reverse();
        // System.out.println(" modified list is" +str);
    }
}

