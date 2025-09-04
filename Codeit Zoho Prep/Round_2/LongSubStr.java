public class LongSubStr{

    public static void main(String[] args) {
        String str="ababcdc";
        String str1="AaaBb";
        String str2="pwwekk";
        String str3="abcd$";
        System.out.println(LongSubStr(str));
        System.out.println(LongSubStr(str1));
        System.out.println(LongSubStr(str2));
        System.out.println(LongSubStr(str3));
    
    }

    public static int LongSubStr(String str){
        int start=0;
        int maxLen=0;
        int[] lastSeen=new int[256];
        int length=str.length();
        for (int i = 0; i < length ; i++) {
            char CurrentChar=str.charAt(i);
            if(lastSeen[CurrentChar] > start){
                start=lastSeen[CurrentChar];
            }
            lastSeen[CurrentChar]=i+1;
            maxLen=Math.max(maxLen,i+1-start);
        }

        return maxLen;
    } 
    


}

