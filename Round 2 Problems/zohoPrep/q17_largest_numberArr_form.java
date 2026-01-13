

public class q17_largest_numberArr_form {
    public static void main(String[] args) {
        int[] arr={8,7,1,1,9};
        int ans=largestForm(arr);
        System.out.println(ans);
    }
    public static int largestForm(int[] arr){
        int max=0;
        for(int num:arr){
            if(num > max) max=num;
        }
        int[] count=new int[max+1];
        for(int num:arr){
            count[num]++;
        }
        int result=0;
        for (int i = max; i >= 0; i--) {
            if(count[i] > 0){
                result = result  *10 +i;
                count[i]--;
            }
        }
        return result;
    }
}
