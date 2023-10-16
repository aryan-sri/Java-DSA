import java.util.*;
public class HashSets {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<Integer>();
       
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);
       set.add(2);
       System.out.println(set);
       set.remove(1);
       System.out.println(set);
       if(set.contains(2))
       {
         System.out.println(true);
       }
       Iterator it =  set.iterator();
       while(it.hasNext())
       {
          System.out.println(it.next());
       }
    }
}
