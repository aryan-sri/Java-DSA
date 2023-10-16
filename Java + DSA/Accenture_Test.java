import java.util.*;
public class Accenture_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.nextLine();
        String T = sc.nextLine();
        int[] cost = new int[M];
        System.out.println(Valu('b','y'));
        for(int i = 0;i<M;i++)
        {
            char c = T.charAt(i);
            int sum = 0;
            for(int j =0;j<N;j++)
            {
                char c2 = S.charAt(j);
                if(c != c2)
                {
                    sum += Valu(c2,c); 
                }
            }
            cost[i] = sum;
        }
    }
    public static int Valu(char c2, char c) {
        char[] arr= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count =0;
        while(c!=c2)
        {
            
        }

    }
    

}
