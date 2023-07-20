public class rc_dice_combinations {
    public static void Combi(String p ,int d)
    {
        if(d == 0)
        {
            System.out.println(p);
            return;
        }
        
        for(int i = 1;i<=6 && i<=d;i++)
        {
            Combi(p+i, d-i);
        }
    }
    public static void main(String[] args) {
       Combi("", 4); 
    }
}
