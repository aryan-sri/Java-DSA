public class RC_Maze_All_Paths {
    public static void Paths(String p , int r , int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            Paths(p+"D", r-1, c);
        }
        if(c>1)
        {
            Paths(p+"R", r, c-1);
        }
        
    }
    public static void main(String[] args) {
        Paths("", 3, 3);
    }
}
