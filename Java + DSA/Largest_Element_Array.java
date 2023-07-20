import java.util.*;
public class Largest_Element_Array {
     public static void main(String[] args) {
        
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = new Scanner(System.in).nextInt();
        }
        int g = arr[0];
        for(int j =0;j<arr.length;j++)
        {
             if(arr[j]>= g)
             {
                g = arr[j];
             }
        }
        System.out.println("Greatest is "+g);
     }
}
