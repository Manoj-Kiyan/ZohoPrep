package Arrays;
class count1s{
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,1,0,1,1};
        ones(arr);
    }
    public static void ones(int[] arr){
        int maxOnes=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
                        if(arr[i] == 1){
                            count++;
                            maxOnes=Math.max(maxOnes, count);      
                        }else{
                            count=0;
                        }
        
        }
        System.out.println("Maximum Consicutive One's occurs "+maxOnes+" times in a array");
        
    }
}