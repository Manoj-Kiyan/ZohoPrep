import java.util.Arrays; 

public class MissingNumber { 

    public static void main(String[] args) {

        int[] arr1 = {3, 0, 1}; 
        int[] arr2={0,2,3};
        int missingNumberResult2=MissingNo2(arr2);
        int missingNumberResult = MissingNo(arr1);

        
        
        System.out.println("The missing number in " + Arrays.toString(arr1) + " is: " + missingNumberResult);
        System.out.println("The missing number in " + Arrays.toString(arr2) + " is: " + missingNumberResult2);
        //System.out.println("The missing number in [0, 1] is: " + MissingNo(new int[]{0, 1}));
    }

   
    public static int MissingNo(int[] nums) { 
        // Parameter name changed to nums for clarity within the method
        int n = nums.length;

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum); // This method MUST return an int
    }

    public static int MissingNo2(int[] arr2){
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]+1!=arr2[i+1]){
                return arr2[i]+1;
            }
        }
        return arr2.length;
       


    }
}