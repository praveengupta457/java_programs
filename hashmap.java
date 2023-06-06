import java.util.*;
 public class hashmap {
//     public static void main(String[] args) {
//         HashMap <Integer, String> map= new HashMap<Integer,String>();
//         map.put(1,"ram"); map.put(2,"bharat");   map.put(3,"lakshman");  map.put(4,"shatrudhana");
//         System.out.println("map contains "+map);
//         map.put(4,"abcd");
//         map.putIfAbsent(5,"dashrat");
//         System.out.println("updated list " +map);
//        // map.replace(3);
//        // System.out.println("updated list " +map);

//     }
// }
// public static void main(String[] args) {
//     Set<Integer> set= new TreeSet<Integer>();
//     set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);set.add(6);set.add(7);
//     System.out.println("set contains "+set);
//     } 
// }
// public static void main(String[] args) {
//     Set<Integer> set= new HashSet<Integer>();
//     Set<Integer> set1= new TreeSet<Integer>();
//     set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);set.add(6);set.add(7);
//     set.clear();
//     System.out.println("set contains "+set);
//     set1.add(1);set1.add(2);set1.add(3);set1.add(4);set1.add(5);set1.add(6);set1.add(7);
//     System.out.println("set contains "+set1);
//   } 
// }
public static void main(String[] args) {
    ArrayList<Integer> set= new ArrayList<Integer>();
    Set<Integer> set1= new TreeSet<Integer>();
    HashMap <Integer, String> map= new HashMap<Integer,String>();
     map.put(1,"ram"); map.put(2,"bharat");   map.put(3,"lakshman");  map.put(4,"shatrudhana");
   System.out.println("hashmap contains "+map);
   TreeMap <Integer, String> map1= new TreeMap<Integer,String>();
     map1.put(1,"ram"); map1.put(3,"bharat");   map1.put(5,"lakshman");  map1.put(4,"shatrudhana");
   System.out.println("treemap contains "+map);
    Vector<String> vec=new Vector<String>();
    vec.add("jai"); vec.add("cigrette"); vec.add("gutka"); vec.add("obsolete"); vec.add("imitate");
    System.out.println("vector contain "+vec);
    set.add(1);set.add(2);set.add(3);set.add(3);set.add(5);set.add(6);set.add(7);//duplicate vallue is allowed
    //set.clear();
    System.out.println("arraylist contains "+set);
    set1.add(1);set1.add(2);set1.add(3);set1.add(3);set1.add(5);set1.add(6);set1.add(7);//duplicate value not allowed
    System.out.println("treeset contains "+set1);
  }

}

