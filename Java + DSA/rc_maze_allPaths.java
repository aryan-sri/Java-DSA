import java.util.Arrays;

public class rc_maze_allPaths {
    public static void main(String[] args) {
        boolean maze[][] = { {true, true ,true},
                             {true, true ,true},
                             {true, true,true}};
        int path[][] = new int[3][3];
        AllPAths("", 0, 0, 0,maze , path);
    }
    public static void AllPAths(String p ,int r , int c , int steps , boolean[][] maze , int[][] path)
    {

        if(r == maze.length-1 && c==maze[0].length-1)
        {
            for(int[] arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        path[r][c] = steps;
        if(r<maze.length-1)
        {
             AllPAths(p+"D", r+1, c, steps+1, maze, path);
        }
        if(c<maze[0].length-1)
        {
            AllPAths(p+"R", r, c+1, steps+1, maze, path);
        }
        if(r>0)
        {
            AllPAths(p+"U", r-1, c, steps+1, maze, path);
        }
        if(c>0)
        {
            AllPAths(p+"L", r, c-1, steps+1, maze, path);

        }
        //BackTracking

        maze[r][c] = true;
        path[r][c] = 0;
    }
}

