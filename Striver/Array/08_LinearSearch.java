package Striver.Array;

class LinearSearch {
    static int linear(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key=5;
        if(linear(arr, key)!=-1){
            System.out.println("Element found at " + linear(arr, key) + " of the array");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
