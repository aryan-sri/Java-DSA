public class Fibo {

    static int a = 0;
    static int b = 1;

    static void Fibo(int N, int i, int c) {
        if (c < N) {
            System.out.println(i);
            i = a + b;
            a = b;
            b = i;
            Fibo(N, i, ++c);
        }

    }

    public static void main(String[] args) {
        Fibo(5, 0, 0);
    }
}
