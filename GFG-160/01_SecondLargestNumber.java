// import java.util.Arrays;
class SecondLargestNumber {

    static int SecondLargest(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("The second largest is :- " + SecondLargest(arr));
    }
}