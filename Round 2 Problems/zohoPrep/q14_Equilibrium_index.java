public class q14_Equilibrium_index {
    public static void main(String[] args) {    
        int[] arr={3,4,9,6,1};
        int ans=isEquili(arr);
        System.out.println(ans);
    }
    public static int isEquili(int[] arr){
        int totalSum=0;
        int leftSum=0;
        for(int num:arr){
            totalSum +=num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -=arr[i];
            if(totalSum == leftSum){
                return i;
            }
            leftSum +=arr[i];
        }
        return -1;
    }
}

