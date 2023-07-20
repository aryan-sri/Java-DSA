public class Array_Equality_CHeck {
    
    public static void main(String[] args) {
        
        int a[] = new int[10];
        int b[] = new int[10];
        
        boolean check = true;
        for(int i =0;i<10;i++)
        {
            if(a[i] != b[i])
            {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
