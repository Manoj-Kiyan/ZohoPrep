public class Panagram {
    public static void main(String[] args) {
         String str="abcd efgh ijkl MNOP qrst UVW Xyz";
         System.out.println(checkPanagram(str));
    }
    public static boolean checkPanagram(String str){
        boolean[] arr=new boolean[26];
        String LowCase=str.toLowerCase();
        int index=0;
        for (int i = 0; i < LowCase.length(); i++) {
            char ch=LowCase.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
               index=ch - 'a';
               arr[index]=true;
            }    
        }
        for (int i = 0; i < 26; i++) {
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
   
}


