public class Subarray {
    public static void main(String[] args) {
        int[] arr = {-2,-1};
        int g = -99999;
      for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                int sum=0;
                boolean flag = false;
                for(int k= i ;k<=j;k++)
                {
                    sum = sum+ arr[k];
                    flag = true;
                }
                if(flag)
                {
                if(sum>=g)
                {
                    g= sum;
                }
            }
                
            }
        }  
        System.out.println(g);
    }
}
