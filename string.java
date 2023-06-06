public class string {
    public static void main(String[] args) {

        
        String s="abcd";   //string lateral ......string without new keyword saved in stringlateral
        System.out.println(s);
        // s.concat("xyxzzxx");
        // System.out.println(s);
        // s=s.concat("   jumbo");
        // System.out.println(s);
      // String str=s.concat("    xxxxxxx");
       //System.out.println(str);
        // String s1=new String("vwxy");   //saved in string and will creat a new string for it
        // System.out.println(s1);
        String s2="abcd";   //constant pool ....constant value is copied here
        String st=new String("Abcd");
        System.out.println(s==s2);
        System.out.println(s==st);// here  "abcd" false is output because refrence is diff and this checks addredss which is diffrent
        System.out.println(s.equals(st));//here true because it checks value which is gopal
        System.out.println(s.equalsIgnoreCase(st));   
        String ss="raj";
        System.out.println(ss.compareTo(s));    //s>ss +ve  laxicographically
     }
}
