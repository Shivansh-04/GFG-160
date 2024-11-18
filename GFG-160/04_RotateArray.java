class RotateArray {
    static void Rotate(int[] arr,int n,int d){
        int[] temp = new int[n];
        int j=0;
        for(int i=d;i<n;i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
            temp[j]=arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++){   
            arr[i] = temp[i];
        }
        
    }

    static void Rotate2(int[] arr,int d){
        int n = arr.length;
        d = d % n;  // In case d is greater than array length
        
        if (d == 0) return;  // No rotation needed if d is 0 or a multiple of n
        
        // Create a temporary array to store the first d elements
        int[] temp = new int[d];
        
        // Step 1: Store the first d elements in the temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the rest of the array to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Step 3: Copy the temporary array elements to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10,12,14,16,18,20};
        int n=arr2.length;
        int d=3;
        Rotate(arr2,n, d);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
    
}
// Input: arr[] = [1, 2, 3, 4, 5], d = 2
// Output: [3, 4, 5, 1, 2]
// Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2
// Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
// Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
// Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.