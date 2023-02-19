import java.util.Arrays;

public class Sheet {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(final int[] A) {
       
        int j =0;
        while(j<A.length)
        {
            int correct = A[j]-1;
            if(A[j] != correct)
            {
                int temp = A[j];
                A[j] = A[correct];
                A[correct] = temp;
            }
            else
            {
                j++;
            }
        }
        int[] ans  = new int[2];
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i] == A[i+1])
            {
                ans[0] = A[i];
                
            }
            if(A[i] != i+1)
            {
                ans[1] = i+1;
                break;
            }
            
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3 ,1, 2 ,5 ,3}; 
        System.out.println(Arrays.toString(repeatedNumber(arr)));
    }
}
