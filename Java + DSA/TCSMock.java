import java.util.*;
class TCSMock {
  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    boolean res = false;
    int n = ob.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = ob.nextInt();
    }
    int s = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      s = Math.min(s, arr[i]);
    }
    
    for (int i = 60 ; i <= 10000; i++) {
      boolean flag = true;
      for (int j = 0; j < n; j++) {
        int r = i% arr[j];
        if ( arr[j] != s &&r != s) {
          flag = false;
          break; 
        }
      }
      if (flag) {
        if (isPrime(i)) {
          res = true;
          System.out.println(i);
          break;
        }
      }
    }

    if (!res) {
      System.out.println("NONE");
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
