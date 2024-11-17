package Striver.Array;

public class SortedArray {
    static boolean sorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }

    static int largest(int[] arr){
        // int n = arr.length;
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    static int removeDuplicates(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,6,9};
        int[] arr2 = {1,2,2,5,6,9,5};
        int[] arr3 = {5,9,8,3,62,45,7,5,62};
        int[] arr4 = {1,1,1,2,2,3,3,3,4};
        // System.out.println(sorted(arr));
        // System.out.println(sorted(arr2));
        // System.out.println(largest(arr3));
        System.out.println(removeDuplicates(arr4));
    }
}
