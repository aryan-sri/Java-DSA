public class rc_Subseq {
    public static void main(String[] args) {
        String str= "123 ";
        SubSeq("",str); 
    }
    public static  void SubSeq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        
        SubSeq(p+ch, up.substring(1));
        SubSeq(p, up.substring(1)); 
        
    }

}

