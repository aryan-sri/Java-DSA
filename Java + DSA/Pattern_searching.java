public class Pattern_searching {
     public static void main(String[] args) {
        String txt = "THIS IS A TEST TEXT";
        String pat = "TEST";
        for(int i=0;i<txt.length();i++)
        {
            if(txt.charAt(i) == pat.charAt(0))
            {
                if((txt.substring(i,i+pat.length())).equals(pat))
                {
                    System.out.println(i);
                }
            }
        }

     }
}
