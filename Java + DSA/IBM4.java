public class IBM4 {
    public static void main(String[] args) {
        int km =400;
        int hr = 8;
        int val =0;
        if(km<=250 && hr<=8)
        {
          val = 2000;
        }
        else if(km>=250 && hr<=8)
        {
            int ex = (km-250)*20;
            val = 2000+ex;

        }
        else if(km<=250 && hr>8)
        {
            int ex = hr-8;
            val = 2000 + ex*100;
        }
        else
        {
            int ex = (km-250)*20;
            val = 2000+ex;
        }
        System.out.println(val);
    }
}
