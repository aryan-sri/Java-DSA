public class Insertion_Sort {
    
  public static void main(String[] args) {

    int arr[] = { 5,4,3,1,2};
    int res[] = InsertionSort(arr);

    for(int i =0;i<res.length;i++)
    {
        System.out.print(res[i]+" ");
    }
    
  }
  
  public static int[] InsertionSort(int arr[])
  {
    for(int i =0;i<arr.length-1;i++)
    {
        for(int j=i+1;j>=1;j--)
        {
             if(arr[j] < arr[j-1])
             {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
             }
             else
             {
                break;
                
             }
        }
    }
    return arr;
  }
}
