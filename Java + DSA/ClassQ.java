import java.util.Arrays;

import org.w3c.dom.ls.LSException;

public class ClassQ {

    public static int HighestProduct(int[] arr, int k) {

        int[] pro = new int[arr.length-k+1];
        for(int i =0;i<arr.length;i++)
        {
            
             if(i+k <= arr.length)
             {
                 pro[i] = 1;
                for(int j = i; j<i+k;j++)
                {
                    
                    pro[i] = pro[i]* arr[j];
                   
                }
                
               
             }
            
        }
        System.out.println(Arrays.toString(pro));
        return pro[Greatest(pro)];
        
        
    }

    public static int Greatest(int[] ar)
    {
          int g = 0;
          for(int i =0;i<ar.length;i++)
          {
            if(ar[i]>ar[g])
            {
                g = i;
            }
          }
          return g;
    }

    public static String SpecailPrint(char[] c)
    {
        String fi="";
        String UnderScore ="";
        String le = "";
        for(int i =0;i<c.length;i++)
        {
            if(c[i] == '-')
            {
                UnderScore = UnderScore+c[i];
            }
            else
            {
                le = le + c[i];
            }
        }
        fi = UnderScore+le;
        return fi;
    }

    public static int Greatest(int[] arr, boolean flag, int ele) {
        int g = -99999;
        if (flag) {
            for (int i = 0; i < arr.length; i = i + 2) {
                if (arr[i] != ele && g <= arr[i]) {
                    g = arr[i];
                }
            }

        } else {
            for (int i = 1; i < arr.length; i = i + 2) {
                if (g <= arr[i] && arr[i] != ele) {
                    g = arr[i];
                }
            }

        }
        return g;
    }

    public static boolean CharVal(char c) {
        if (c == '1') {
            return true;
        } else {
            return false;
        }
    }

    

    // public static boolean StringOp(String s) {
    //     char[] a = s.toCharArray();
    //     boolean preV;
    //     if (a[1] == 'A') {
    //         preV = CharVal(a[0]) && CharVal(a[2]);
    //     } else if (a[1] == 'B') {
    //         preV = CharVal(a[0]) || CharVal(a[2]);
    //     } else if (a[1] == 'C') {
    //         preV = CharVal(a[0]) ^ CharVal(a[2]);
    //     }
    //     for (int i = 3; i < a.length; i++) {
    //         int count =0;
    //         char preVC , nextVC, oP;
    //         if(i%2==1 && count ==0)
    //         {
    //              preV = CharVal(a[i]);
    //              count++;
    //         }
    //         else if(i%2== 0 && count ==1)
    //         {
    //             oP = a[i];
    //             count++;
    //         }
    //         else if(i%2 ==1 && count ==2)
    //         {
    //             nextVC = a[i];
    //             count++;
    //         }
    //         if(count == 3)
    //         {
    //              if (a[1] == 'A') {
    //                preV = CharVal(a[0]) && CharVal(a[2]);
    //     }     else if (a[1] == 'B') {
    //         preV = CharVal(a[0]) || CharVal(a[2]);
    //     } else if (a[1] == 'C') {
    //         preV = CharVal(a[0]) ^ CharVal(a[2]);
    //     }
    //         }
    //     }
    
    public static int Sum(int start, int end , int arr[]) {
        int sum=0;
        for(int i = start; i<end;i++)
        {
             sum = sum+arr[i];
        }
        return sum;
        
    }
    public static int Equillibrium(int arr[])
    {
        for(int i =1 ;i<arr.length;i++)
        {
            int leftSum = Sum(0,i,arr);
            int righSum = Sum(i+1,arr.length,arr);
            if(leftSum == righSum)
            {
                return i;
            }
        }
        return 0;
    }

    public static int SmallSum(int[] arr) {
        int even = Greatest(arr, true, -9999);
        int feven = Greatest(arr, true, even);
        int odd = Greatest(arr, false, (Greatest(arr, false, -9999)));
        return feven + odd;
    }

    public static String DecimaltoBinary(int i) {
        String res = "";
        String st = "";
        while(i!=0)
        {
            int d = i%2;
            res= res+d;
            i = i/2;

        }
        for(int j = res.length()-1;j>=0;j--)
        {
             char c = res.charAt(j);
             st = st+c;
        }
        return st;
    }
    public static int CalculatedigitSum(int n) {
        {
            int sum = 0;
            String s = String.valueOf(n);
            for(int i =0;i<s.length();i++)
            {
                char c = s.charAt(i);
                sum = sum + (Integer.parseInt(c+""));
                
            }
            return sum;
        }
        
    }

    public static void main(String[] args) {

        // int arr[] = { 10,2,8,5,-4,1 };
        // System.out.println(arr[Equillibrium(arr)]);
        // String s = "He-llo-Wo-rld";
        // char[] c = s.toCharArray();
        // System.out.println(SpecailPrint(c));
        int ar[] = {-6, -8, 10 , -1, 5, 6};
        System.out.println(HighestProduct(ar, 2));
        System.out.println(DecimaltoBinary(100));
        System.out.println(CalculatedigitSum(100));
        Arrays.sort(ar);
        if(ar.length%2 ==0)
        {
            int start =0;
            int end = ar.length-1;
            while(start<=end)
            {
                System.out.println("[" + ar[start] + " ,"+ar[end]+"]");
                start++;
                end--;
            }
        }

    }
}

