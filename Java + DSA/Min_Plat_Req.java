import java.util.*;

public class Min_Plat_Req {
    public static void main(String[] args) {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 }; 
        System.out.println(MinPlatforms(arr, dep));
    }
    public static int MinPlatforms(int[] arrival , int[] departure)
    {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int minPla = 0;
        int plaNeeded = 0;

        int i =0;
        int j =0;
        while(i<arrival.length && j<departure.length)
        {
            if(arrival[i] < departure[j])
            {
                plaNeeded++;
                minPla = Math.max(plaNeeded, minPla);
                i++;
            }
            else
            {
                j++;
                plaNeeded--;
            }
        }
        return minPla;
    }
}
