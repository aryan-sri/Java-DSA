import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeAndSort(int[] inputList, int num) {
        int[] answer = new int[inputList.length];
        int[] a1 = new int[num];
        int[] a2 = new int[inputList.length - num];

        
        for (int i = 0; i < num; i++) {
            a1[i] = inputList[i];
        }

        
        for (int i = num; i < inputList.length; i++) {
            a2[i - num] = inputList[i];
        }

        Arrays.sort(a1);
        Arrays.sort(a2);

        
        for (int i = 0; i < num / 2; i++) {
            int temp = a1[i];
            a1[i] = a1[num - 1 - i];
            a1[num - 1 - i] = temp;
        }

       
        for (int i = 0; i < num; i++) {
            answer[i] = a1[i];
        }

        int j = 0;
        for (int i = num; i < inputList.length; i++) {
            answer[i] = a2[j];
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] inputList = {8, 11, 7, 5, 10, 46, 23, 16, 8};
        int num = 3;

        int[] mergedAndSorted = mergeAndSort(inputList, num);

        System.out.println("Merged and Sorted Array:");
        for (int i : mergedAndSorted) {
            System.out.print(i + " ");
        }
    }
}
