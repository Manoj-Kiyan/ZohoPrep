public class q16_Bitonic_point {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int ans = bitonicPoint(arr, 0, arr.length - 1);
        System.out.println("Bitonic point: " + ans);
    }

    public static int bitonicPoint(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid]; 
                } else if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1;   
                }
            } else if (mid == 0) {
                return arr[0] > arr[1] ? arr[0] : arr[1];
            } else if (mid == arr.length - 1) {
                return arr[arr.length - 1] > arr[arr.length - 2] ? arr[arr.length - 1] : arr[arr.length - 2];
            }
        }
        return -1; 
    }
}
