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

    public static void main(String[] args) {
        int[] arr={1,0,2,0,5,0,6,0};
        Native(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
