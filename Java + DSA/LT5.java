import java.util.ArrayList;
import java.util.Arrays;

class LT5 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1}};
        ArrayList<Integer> check = new ArrayList<>();
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    check.add(i);
                    check.add(j);
                }
            }
        }
        for(int i = 0;i<check.size();i++)
        {
            if(i%2==0){
                int s = matrix[0].length;
            //rows
            for(int j=0;j<=matrix.length;j++)
            {
                matrix[check.get(i)][j] =0;
            }
            }
            else
            {
                for(int j=0;j<matrix.length;j++)
            {
                matrix[j][check.get(i)] =0;
            }
            }
        }

        System.out.println(matrix[0][0] + " "+ matrix[0][1]);

    }
    
}