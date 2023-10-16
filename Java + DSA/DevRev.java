public class DevRev {

 public static int longestIncreasingChain(int[] arr) {

   int longestChain = 0;

   // Loop through the array and check each element

   for (int i = 0; i < arr.length; i++) {

     int currentElement = arr[i];

     // Calculate the length of the increasing chain starting from the current element

     int chainLength = 1;

     for (int j = i + 1; j < arr.length; j++) {

       if (arr[j] > currentElement) {

         chainLength++;

         currentElement = arr[j];

       } else {

         break;

       }

     }

     // Update the longest chain if necessary

     if (chainLength > longestChain) {

       longestChain = chainLength;

     }

   }

   return longestChain;

 }

 public static void main(String[] args) {

//    int[] arr1 = {11, 10, 4, 3, 8, 9};

//    System.out.println(longestIncreasingChain(arr1)); // 3

   int[] arr2 = {4, 10, 4, 3, 8 ,9};

   System.out.println(longestIncreasingChain(arr2)); // 2

//    int[] arr3 = {1, 2, 3, 4, 5};

//    System.out.println(longestIncreasingChain(arr3)); // 5

 }

}