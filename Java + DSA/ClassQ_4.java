import java.util.Arrays;

public class  ClassQ_4{
    public static void main(String[] args) {
        int arr[] = {1,7,9,8,5,4};
        int first[] = new int[arr.length/2];
        int second[] = new int[arr.length/2];
        int ans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                 if(arr[j]>arr[j+1])
                 {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }
        
        for(int i =0;i<arr.length/2;i++)
        {
            first[i] = arr[i];
            second[i] = arr[arr.length-i-1];
        }
        int k=0;
        for(int i =0;i<arr.length;i++)
        {
            if(i<first.length)
            {
                ans[i] = first[i];
            }
            else 
            {
                ans[i] = second[k];
                k++;
            }
        }
      
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(ans));
        
        
        
    }
}
