package Striver.Array;
class LeftMoveByD {
    static void brute(int[] arr,int d){
        int n = arr.length;
        // int k=d%n;
        d=d%n;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }

        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }

    }

    static void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void optimal(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        rev(arr, 0, d-1);
        rev(arr, d, n-1);
        rev(arr, 0, n-1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        optimal(arr, 3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
