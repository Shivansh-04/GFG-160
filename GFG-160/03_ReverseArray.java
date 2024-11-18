
class ReverseArray {
    static void NativeRev(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        // Arrays.sort(arr);
        int j=0;
        for (int i = n-1; i >=0; i--) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++){   
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,3,8,9,1};
        NativeRev(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
