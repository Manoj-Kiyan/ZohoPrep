package CodeThanish;

public class ImplementStr {
    public static void main(String[] args) {
        String s="GeeksForGeeks";
        String x="For";
        int value=findstr(s, x);
        System.out.println(value);  
        findstr2(s, x);
         
    }
    public static int findstr(String s,String x){
        int l;
       
        int flag=0;

        for (int i = 0; i < s.length(); i++) {
            l=i;
            if(s.charAt(i)==x.charAt(0)){
                for (int j = 0; j < x.length(); j++) {
                    if(l<s.length() && s.charAt(l)==x.charAt(j)){
                        l++;
                        flag=1;
                    }else{
                        flag=0;
                        break;
                    }
                    
                }
                if(flag==1){
                    return i;
                }

            }
               
        }
        return -1;
        
    }


     public static void findstr2(String s, String x) {
        int l;

        for (int i = 0; i <= s.length() - x.length(); i++) {
            l = i;
            int j;
            for (j = 0; j < x.length(); j++) {
                if (s.charAt(l) != x.charAt(j)) {
                    break;
                }
                l++;
            }
            if (j == x.length()) {
                int start = i;
                int end = i + x.length() - 1;
                System.out.println(x + " found at index: " + start + " to " + end);
                return;
            }
        }
        
        System.out.println(x + " not found in the string.");
    }
    
}