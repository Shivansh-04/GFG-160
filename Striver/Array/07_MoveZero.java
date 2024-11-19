package Striver.Array;

class MoveZero {
    static void Native(int[] arr){
        int[] arr1=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr1[j++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr1[i];
    }
    static int[] optimal(int[] arr){
        int j=-1;
        // int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr={1,0,2,0,3,0,2,3,2,1,0,1,2};
        optimal(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
