import java.util.*;

public class rc_permutation {
    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char c = up.charAt(i);
            String remaining = up.substring(0, i) + up.substring(i + 1);
            permutation(p + c, remaining);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation("", s);
    }
}
