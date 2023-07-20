import java.util.*;
public class ClassQ_1 {
    static Queue<Integer> queue = new LinkedList<>();
    static int ans[];
    static boolean pos[];
    public static void ModifyAr(int time) {
        for(int i =0;i<ans.length;i++)
        {
            if(pos[i] == true)
            {
                ans[i] = ans[i]+time;
            }
        }
    }
    public static void Modify(int max)
    {
        int i =0;
        while(!queue.isEmpty())
        {
            if(pos[i] == true)
            {
                int first = queue.remove();
                if(first <4)
                {
                    ModifyAr(2);
                    pos[i] = false;
                }
                else
                {
                    ModifyAr(7);
                    first = first - 6;
                    queue.add(first);
                }
                if(i>=ans.length-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }
            }
            else
            {if(i>=ans.length-1)
                {
                    i=0;
                }
                else
                {
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
         int n  = 6;
         ans = new int[n];
         pos = new boolean[n];
         for(int i =0;i<n;i++)
         {
            int input = new Scanner(System.in).nextInt();
            queue.add(input);
            pos[i] = true;
            ans[i] = 0;
         }
         System.out.println(Arrays.toString(ans));
    }
}
