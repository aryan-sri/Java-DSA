public class ClassQ_3 {
     public static void main(String[] args) {
        
         String s = "5511228";
         for(int i =0;i<s.length()-1;i++)
         {
             for(int j =i+1;j<s.length()-1;j++)
             {
                String sub = s.substring(i, j+1);
                int n = Integer.parseInt(sub);
                if(n%11 == 0)
                {
                    System.out.print(sub + ",");
                }
             }
         }
     }
}
