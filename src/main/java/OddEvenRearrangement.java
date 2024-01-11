public class OddEvenRearrangement {
    public static void main(String[] args){
        int[] arr = {12,45,78, 99, 6, 54, 77};
        int n = arr.length;
        reaarangeOddEven(arr, n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void reaarangeOddEven(int arr[], int n){
        int j = -1, temp;
        for(int i = 0;i<n;i++){
            if(arr[i] % 2 == 0){
                j++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}
